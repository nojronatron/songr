package com.jonxample.songr.models;

import javax.persistence.*;

@Entity
@Table(name="Song")
public class Song {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String title;
    Float length; // seconds
    Integer trackNumber; // the track number on an album??

    @ManyToOne
    Album album;

    public Song() {
    }

    public Song(String title, Float length, Integer trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

}
