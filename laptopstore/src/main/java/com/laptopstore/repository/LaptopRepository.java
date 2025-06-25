package com.laptopstore.repository;

import com.laptopstore.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {
    List<Laptop> findByNameContainingIgnoreCaseOrCpuContainingIgnoreCaseOrRamContainingIgnoreCase(String name, String cpu, String ram);
}