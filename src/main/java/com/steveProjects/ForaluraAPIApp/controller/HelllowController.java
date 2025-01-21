package com.steveProjects.ForaluraAPIApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelllowController {
    @GetMapping
    public String helloWorld() {
        return "Hello World Spring!";
    }
}
