package com.laptopstore.service;

import com.laptopstore.entity.Laptop;
import com.laptopstore.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepo;

    public List<Laptop> getAll() {
        return laptopRepo.findAll();
    }

    public void save(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public Laptop getById(Long id) {
        return laptopRepo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        laptopRepo.deleteById(id);
    }

    public List<Laptop> search(String keyword) {
        return laptopRepo.findByNameContainingIgnoreCaseOrCpuContainingIgnoreCaseOrRamContainingIgnoreCase(
                keyword, keyword, keyword
        );
    }
}
