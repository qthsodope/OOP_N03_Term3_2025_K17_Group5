package com.laptopstore.controller;

import com.laptopstore.service.CartService;
import com.laptopstore.service.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService = new CartService();
    private final LaptopService laptopService = new LaptopService();

    @GetMapping
    public String showCart(Model model) {
        model.addAttribute("items", cartService.getAll());
        model.addAttribute("total", cartService.getTotalPrice());
        return "cart";
    }

    @PostMapping("/client/add")
    public String addToCartFromClient(@RequestParam Long id) {
        cartService.add(laptopService.getById(id));
        return "redirect:/client/laptops";
    }

    @PostMapping("/add/{id}")
    public String addToCart(@PathVariable Long id) {
        cartService.add(laptopService.getById(id));
        return "redirect:/client/laptops";
    }

    @PostMapping("/remove/{id}")
    public String removeFromCart(@PathVariable Long id) {
        cartService.remove(id);
        return "redirect:/cart";
    }

    @PostMapping("/update")
    public String updateQuantity(@RequestParam Long id, @RequestParam int quantity) {
        cartService.updateQuantity(id, quantity);
        return "redirect:/cart";
    }
}