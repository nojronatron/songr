package com.jonxample.songr.controllers;

import com.jonxample.songr.models.Album;
import com.jonxample.songr.repositories.AlbumRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

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

    @PostMapping("/albums")
    public RedirectView createAlbum(String title, String artist, Integer songCount, Float length, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}
