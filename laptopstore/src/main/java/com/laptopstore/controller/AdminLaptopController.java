package com.laptopstore.controller;

import com.laptopstore.entity.Laptop;
import com.laptopstore.service.LaptopService;
import com.laptopstore.service.BrandService;
import com.laptopstore.service.BrandServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/laptops")
public class AdminLaptopController {

    private final LaptopService laptopService = new LaptopService();
    private final BrandService brandService = new BrandServiceImpl();

    @GetMapping
    public String list(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        if (keyword != null && !keyword.trim().isEmpty()) {
            model.addAttribute("list", laptopService.search(keyword));
            model.addAttribute("keyword", keyword);
        } else {
            model.addAttribute("list", laptopService.getAll());
            model.addAttribute("keyword", "");
        }
        return "admin_laptop_list";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("laptop", new Laptop());
        model.addAttribute("brands", brandService.getAll());
        return "admin_laptop_form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Laptop laptop, Model model) {
        if (laptop.getPrice() < 0) {
            model.addAttribute("laptop", laptop);
            model.addAttribute("brands", brandService.getAll());
            model.addAttribute("error", "Giá không được âm!");
            return "admin_laptop_form";
        }

        if (laptop.getBrand() == null) {
            model.addAttribute("laptop", laptop);
            model.addAttribute("brands", brandService.getAll());
            model.addAttribute("error", "Phải chọn hãng!");
            return "admin_laptop_form";
        }

        laptopService.save(laptop);
        return "redirect:/admin/laptops";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("laptop", laptopService.getById(id));
        model.addAttribute("brands", brandService.getAll());
        return "admin_laptop_form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        laptopService.delete(id);
        return "redirect:/admin/laptops";
    }
}