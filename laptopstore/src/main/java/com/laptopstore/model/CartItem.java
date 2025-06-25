package com.laptopstore.model;

import com.laptopstore.entity.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Laptop laptop;
    private int quantity;
}