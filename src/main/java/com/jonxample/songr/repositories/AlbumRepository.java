package com.jonxample.songr.repositories;
import com.jonxample.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

// from docs.spring.io: ...it takes the domain class to manage as well as
// the id TYPE of the domain class as type arguments.
public interface AlbumRepository extends JpaRepository<Album, Long> {
    public Album findByName(String name);
}
