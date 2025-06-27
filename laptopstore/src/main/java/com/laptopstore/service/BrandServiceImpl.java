package com.laptopstore.service;

import com.laptopstore.dao.BrandDao;
import com.laptopstore.entity.Brand;

import java.util.List;

public class BrandServiceImpl implements BrandService {

    private BrandDao brandDao = new BrandDao();

    @Override
    public List<Brand> getAll() {
        return brandDao.findAll();
    }

    @Override
    public void save(Brand brand) {
        if (brand.getId() == null) {
            brandDao.insert(brand);
        } else {
            brandDao.update(brand);
        }
    }

    @Override
    public Brand getById(Long id) {
        return brandDao.findById(id);
    }

    @Override
    public void delete(Long id) {
        brandDao.delete(id);
    }
}