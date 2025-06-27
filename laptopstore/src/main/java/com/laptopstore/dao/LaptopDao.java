package com.laptopstore.dao;

import com.laptopstore.entity.Brand;
import com.laptopstore.entity.Laptop;
import com.laptopstore.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LaptopDao {

    private BrandDao brandDao = new BrandDao();

    public List<Laptop> findAll() {
        List<Laptop> list = new ArrayList<>();
        String sql = "SELECT * FROM laptop";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Laptop l = new Laptop(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("cpu"),
                        rs.getString("ram"),
                        rs.getLong("price"),
                        brandDao.findById(rs.getLong("brand_id"))
                );
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Laptop findById(Long id) {
        String sql = "SELECT * FROM laptop WHERE id = ?";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Laptop(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("cpu"),
                        rs.getString("ram"),
                        rs.getLong("price"),
                        brandDao.findById(rs.getLong("brand_id"))
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(Laptop laptop) {
        String sql = "INSERT INTO laptop(name, cpu, ram, price, brand_id) VALUES(?, ?, ?, ?, ?)";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, laptop.getName());
            stmt.setString(2, laptop.getCpu());
            stmt.setString(3, laptop.getRam());
            stmt.setLong(4, laptop.getPrice());
            stmt.setLong(5, laptop.getBrand().getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(Laptop laptop) {
        String sql = "UPDATE laptop SET name = ?, cpu = ?, ram = ?, price = ?, brand_id = ? WHERE id = ?";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, laptop.getName());
            stmt.setString(2, laptop.getCpu());
            stmt.setString(3, laptop.getRam());
            stmt.setLong(4, laptop.getPrice());
            stmt.setLong(5, laptop.getBrand().getId());
            stmt.setLong(6, laptop.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Long id) {
        String sql = "DELETE FROM laptop WHERE id = ?";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Laptop> search(String keyword) {
        List<Laptop> list = new ArrayList<>();
        String sql = "SELECT * FROM laptop WHERE name LIKE ? OR cpu LIKE ? OR ram LIKE ?";
        try (Connection conn = JdbcUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            String like = "%" + keyword + "%";
            stmt.setString(1, like);
            stmt.setString(2, like);
            stmt.setString(3, like);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Laptop l = new Laptop(
                        rs.getLong("id"),
                        rs.getString("name"),
                        rs.getString("cpu"),
                        rs.getString("ram"),
                        rs.getLong("price"),
                        brandDao.findById(rs.getLong("brand_id"))
                );
                list.add(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
