package com.jonxample.songr;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public float length; // in seconds
    public String imageUrl;

    public Album(String albumTitle, String artistName,
                 int albumSongCount, float albumSecondsLength,
                 String albumArtUrl) {
        this.title = albumTitle;
        this.artist = artistName;
        this.songCount = albumSongCount;
        this.length = albumSecondsLength;
        this.imageUrl = albumArtUrl;
    }
}
