package com.laptopstore.service;

import com.laptopstore.entity.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
    void save(Brand brand);
    Brand getById(Long id);
    void delete(Long id);
}