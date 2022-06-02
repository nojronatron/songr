package com.jonxample.songr.controllers;

import com.jonxample.songr.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {
    //  wires up the repo to this controller
    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("hello")
    public String helloWorld() {
        return "hello";
    }

    @GetMapping("capitalize/{word}")
    @ResponseBody
    public String capitalizer(@PathVariable String word) {
        String result = word.toUpperCase(Locale.ROOT);
        return result;
    }



    @RequestMapping("/")
    public String rootRoute() {
        return "index";
    }
}
