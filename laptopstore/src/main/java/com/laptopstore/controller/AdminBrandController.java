package com.laptopstore.controller;

import com.laptopstore.entity.Brand;
import com.laptopstore.service.BrandService;
import com.laptopstore.service.BrandServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/brands")
public class AdminBrandController {

    private final BrandService brandService = new BrandServiceImpl();

    @GetMapping
    public String list(Model model) {
        model.addAttribute("list", brandService.getAll());
        return "admin_brand_list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("brand", new Brand());
        return "admin_brand_form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Brand brand) {
        brandService.save(brand);
        return "redirect:/admin/brands";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("brand", brandService.getById(id));
        return "admin_brand_form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        brandService.delete(id);
        return "redirect:/admin/brands";
    }
}