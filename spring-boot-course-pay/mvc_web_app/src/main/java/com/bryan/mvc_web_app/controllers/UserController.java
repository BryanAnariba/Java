package com.bryan.mvc_web_app.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class UserController {

    // http://localhost:3500/details-page
    @GetMapping("/details-page")
    public String details(Model model) {
        model.addAttribute("title", "User Details Page");
        model.addAttribute("first_name", "Goku");
        model.addAttribute("last_name", "Perez");
        return "details";
    }
    
    // http://localhost:3500/details-two-page
    @GetMapping("/details-two-page")
    public String detailsTwo(Map<String, Object> model) {
        model.put("title", "User Details Page Two");
        model.put("first_name", "Gohan");
        model.put("last_name", "Perez");
        return "details-two";
    }
}
