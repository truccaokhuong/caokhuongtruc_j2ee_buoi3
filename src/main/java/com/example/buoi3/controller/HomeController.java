package com.example.buoi3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.buoi3.model.Student;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "xin chào các bạn");
        return "index";
    }

    @GetMapping("/demo")
    public String demoPage(Model model) {
        Student student = new Student(1, "Nguyễn Văn A");
        model.addAttribute("student", student);
        model.addAttribute("message", "Welcome Thymeleaf!");
        return "demo";
    }
}
