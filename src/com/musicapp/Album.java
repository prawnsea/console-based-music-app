package com.musicapp;

public class Album {
    public Album(String title, int releaseDate, String artist) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.Artist = artist;
    }

    String title;
    int releaseDate;
    String Artist;
    public Album(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }
}
