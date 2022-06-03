package com.jonxample.songr.repositories;

import com.jonxample.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
    //  custom queries would go here
}
