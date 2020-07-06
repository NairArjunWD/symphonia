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
        songs.add(new Song("Night Witches", "Sabaton"));
        songs.add(new Song("Devil Dogs", "Sabaton"));
        songs.add(new Song("Hope", "Namie Amuro"));
        songs.add(new Song("Blessed", "Martina McBride"));
        songs.add(new Song("Singing to the Song of Life", "Mandy Moore"));
        songs.add(new Song("Baba Yetu", "Christopher Tin"));
        songs.add(new Song("Sogno di Volare", "Christopher Tin"));
        songs.add(new Song("Battle Scars (acoustic ver.)", "Paradise Fears"));
        songs.add(new Song( "POP/STARS", "K/DA"));
        songs.add(new Song("You Say Run", "Yuki Hayashi"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
