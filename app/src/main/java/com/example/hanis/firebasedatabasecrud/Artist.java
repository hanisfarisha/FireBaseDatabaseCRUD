package com.example.hanis.firebasedatabasecrud;

/**
 * Created by Hanis on 04-Nov-17.
 */

public class Artist {
    String artistId;
    String artistName;

    public Artist(String artistId, String artistName) {
        this.artistId = artistId;
        this.artistName = artistName;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public Artist(){

    }
}
