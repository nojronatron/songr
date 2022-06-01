package com.jonxample.songr.controllers;

import com.jonxample.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {
    // Request method route
    // call a template to display a page
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

    @GetMapping("albums")
    public String getAlbums(Model model) {
        float commonAlbumLength = 60 * 42.735f;

        Album dontCare = new Album("I don't care anymore",
                "AngR",
                7, commonAlbumLength,
                "images/angr-idontcareanymore.jpg");
        Album wasteland = new Album("wasteland",
                "Nihilist Priest",
                6,
                commonAlbumLength,
                "images/nihilistpriest-wasteland.jpg");
        Album shatrd = new Album("Shat-RD",
                "Regurgitated Guts",
                8,
                commonAlbumLength,
                "images/regurgitatedguts-shatrd.jpg");

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(dontCare);
        albums.add(wasteland);
        albums.add(shatrd);

        model.addAttribute("albums", albums);

        return "albums";
    }

    @RequestMapping("/")
    public String rootRoute() {
        return "index";
    }
}
