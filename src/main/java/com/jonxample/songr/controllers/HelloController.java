package com.jonxample.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {
    // Request method route
    // call a template to display a page
    @GetMapping("hello")
    public String helloWorld() {
        return "hello";
    }
}
