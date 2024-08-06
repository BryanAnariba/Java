package com.http_exceptions.http_exeptions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/http-exeptions")
public class AppController {

    @GetMapping("/app")
    public String index() {
        // int value = 100/0;
        int value = Integer.parseInt("10x");
        System.out.println("{ value: "+value + " }");
        return "Ok-200";
    }
}
