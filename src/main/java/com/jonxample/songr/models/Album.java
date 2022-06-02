package com.jonxample.songr.models;

import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id; // 255 characters
    String title;
    String artist;
    Integer songCount;
    Float length; // in seconds
    String imageUrl;

    public Album(){}
    public Album(String albumTitle, String artistName,
                 int albumSongCount, float albumSecondsLength,
                 String albumArtUrl) {
        this.title = albumTitle;
        this.artist = artistName;
        this.songCount = albumSongCount;
        this.length = albumSecondsLength;
        this.imageUrl = albumArtUrl;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist(){
        return this.artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public Integer getSongCount() {
        return this.songCount;
    }
    public void setSongCount(Integer songCount){
        this.songCount = songCount;
    }
    public Float getLength(){
        return this.length;
    }
    public void setLength(Float length){
        this.length = length;
    }
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
}
