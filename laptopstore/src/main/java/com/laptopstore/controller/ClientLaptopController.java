package com.laptopstore.controller;

import com.laptopstore.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/client/laptops")
public class ClientLaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping
    public String list(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        if (keyword != null && !keyword.isEmpty()) {
            model.addAttribute("list", laptopService.search(keyword));
            model.addAttribute("keyword", keyword);
        } else {
            model.addAttribute("list", laptopService.getAll());
        }
        return "client_laptop_list";
    }
}