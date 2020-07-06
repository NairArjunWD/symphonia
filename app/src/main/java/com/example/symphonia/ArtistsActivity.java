package com.example.symphonia;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ArtistsActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array of words
        ArrayList<Song> songs = new ArrayList<Song>();

//        words.add("one");
        songs.add(new Song("Sabaton", "2 Songs"));
        songs.add(new Song("Namie Amuro", "1 Song"));
        songs.add(new Song("Martina McBride", "1 Song"));
        songs.add(new Song("Mandy Moore", "1 Song"));
        songs.add(new Song("Christopher Tin", "2 Songs"));
        songs.add(new Song("Paradise Fears", "1 Song"));
        songs.add(new Song( "K/DA", "1 Song"));
        songs.add(new Song("Yuki Hayashi", "1 Song"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
