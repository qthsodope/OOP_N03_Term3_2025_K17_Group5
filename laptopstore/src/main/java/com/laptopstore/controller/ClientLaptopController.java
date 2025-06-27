package com.laptopstore.controller;

import com.laptopstore.service.LaptopService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client/laptops")
public class ClientLaptopController {

    private final LaptopService laptopService = new LaptopService();

    @GetMapping
    public String list(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("list", laptopService.search(keyword));
            model.addAttribute("keyword", keyword);
        } else {
            model.addAttribute("list", laptopService.getAll());
            model.addAttribute("keyword", "");
        }
        return "client_laptop_list";
    }
}