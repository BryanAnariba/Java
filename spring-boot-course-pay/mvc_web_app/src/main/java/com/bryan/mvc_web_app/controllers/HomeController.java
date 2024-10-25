package com.bryan.mvc_web_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class HomeController {
    
    @GetMapping({"", "/", "/home"})
    public String home() {
        // ojo aqui, ay dos manera de redireccionar la primera redirecciona y la segunda tambien pero te mantiene en la misma ruta
        // return "redirect:/users/list";
        return "forward:/users/list";
    }
}
