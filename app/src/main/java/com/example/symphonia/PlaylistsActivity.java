package com.example.symphonia;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array of words
        ArrayList<Song> songs = new ArrayList<Song>();

//        words.add("one");
        songs.add(new Song("Car Ride", "6 Songs"));
        songs.add(new Song("Calming", "5 Song"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
