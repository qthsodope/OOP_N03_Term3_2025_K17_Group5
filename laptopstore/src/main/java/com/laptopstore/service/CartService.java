package com.laptopstore.service;

import com.laptopstore.entity.Laptop;
import com.laptopstore.model.CartItem;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartService {
    private Map<Long, CartItem> cart = new LinkedHashMap<>();

    public void add(Laptop laptop) {
        CartItem item = cart.get(laptop.getId());
        if (item == null) {
            cart.put(laptop.getId(), new CartItem(laptop, 1));
        } else {
            item.setQuantity(item.getQuantity() + 1);
        }
    }

    public void remove(Long id) {
        cart.remove(id);
    }

    public void updateQuantity(Long id, int quantity) {
        CartItem item = cart.get(id);
        if (item != null) {
            item.setQuantity(quantity);
        }
    }

    public void clear() {
        cart.clear();
    }

    public List<CartItem> getAll() {
        return new ArrayList<>(cart.values());
    }

    public long getTotalPrice() {
        return cart.values().stream()
                .mapToLong(i -> i.getLaptop().getPrice() * i.getQuantity())
                .sum();
    }
}