package com.laptopstore.service;

import com.laptopstore.dao.LaptopDao;
import com.laptopstore.entity.Laptop;

import java.util.List;

public class LaptopService {

    private LaptopDao laptopDao = new LaptopDao();

    public List<Laptop> getAll() {
        return laptopDao.findAll();
    }

    public void save(Laptop laptop) {
        if (laptop.getId() == null) {
            laptopDao.insert(laptop);
        } else {
            laptopDao.update(laptop);
        }
    }

    public Laptop getById(Long id) {
        return laptopDao.findById(id);
    }

    public void delete(Long id) {
        laptopDao.delete(id);
    }

    public List<Laptop> search(String keyword) {
        return laptopDao.search(keyword);
    }
}