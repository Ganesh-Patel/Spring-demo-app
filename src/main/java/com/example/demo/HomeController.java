package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/") 
    public String home() {
        return "Welcome to the Demo Application!";
    }
    @GetMapping("/print") 
    public String print() {
        return "Welcome to the Demo Application! here you are in print method++++++++ ";
    }
}
