package com.laptopstore.service.impl;

import com.laptopstore.entity.Brand;
import com.laptopstore.repository.BrandRepository;
import com.laptopstore.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepo;

    @Override
    public List<Brand> getAll() {
        return brandRepo.findAll();
    }

    @Override
    public void save(Brand brand) {
        brandRepo.save(brand);
    }

    @Override
    public Brand getById(Long id) {
        return brandRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        brandRepo.deleteById(id);
    }
}
