package com.example.symphonia;

public class Song {

    /** Default translation for the word */
    private String playerSongName;

    /** Miwok translation for the word */
    private String playerArtistName;

    /**
     * Create a new Word object.
     *
     * @param songName is the word in a language that the user is already familiar with. (Such as English)
     *
     * @param artistName is the word in the Miwok language
     */
    public Song(String songName, String artistName) {
        playerSongName = songName;
        playerArtistName = artistName;
    }

    /**
     * Get the Song name of the song.
     */
    public String getplayerSongName() {
        return playerSongName;
    }

    /**
     * Get the Artist name of the song.
     */
    public String getplayerArtistName() {
        return playerArtistName;
    }

}
