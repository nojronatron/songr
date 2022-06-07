package com.jonxample.songr.repositories;

import com.jonxample.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    // input parameters and the method name itself is IMPORTANT
    public Album findByTitle(String title);
}
