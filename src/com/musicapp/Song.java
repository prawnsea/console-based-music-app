package com.musicapp;

public class Song {
    String title;
    double duration;

    public Song(String title, double duration, String artist, String album) {
        this.title = title;
        this.duration = duration;
        this.Artist = artist;
        this.Album = album;
    }

    String Artist;
    String Album;
    public Song(){

    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getArtist() {
        return Artist;
    }

    public String getAlbum() {
        return Album;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public void setAlbum(String album) {
        Album = album;
    }
}
