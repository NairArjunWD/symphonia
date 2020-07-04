package com.example.symphonia;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array of words
        ArrayList<Song> songs = new ArrayList<Song>();

//        words.add("one");
        songs.add(new Song("song1", "artist1"));
        songs.add(new Song("song2", "artist2"));
        songs.add(new Song("song3", "artist3"));
        songs.add(new Song("song4", "artist4"));
        songs.add(new Song("song5", "artist5"));
        songs.add(new Song("song6", "artist6"));
        songs.add(new Song("song7", "artist7"));
        songs.add(new Song("song8", "artist8"));
        songs.add(new Song( "song9", "artist9"));
        songs.add(new Song("song10", "artist10"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }


}
