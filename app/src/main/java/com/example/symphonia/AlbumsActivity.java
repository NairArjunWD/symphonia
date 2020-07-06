package com.example.symphonia;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class AlbumsActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Create an array of words
        ArrayList<Song> songs = new ArrayList<Song>();

//        words.add("one");
        songs.add(new Song("Heroes", "Sabaton"));
        songs.add(new Song("The Great War", "Sabaton"));
        songs.add(new Song("Finally/ One Piece Whole Cake Island Soundtrack", "Namie Amuro"));
        songs.add(new Song("Greatest Hits", "Martina McBride"));
        songs.add(new Song("Mandy Moore", "Mandy Moore"));
        songs.add(new Song("Civilizaton IV Soundtrack", "Christopher Tin"));
        songs.add(new Song("Civilizaton VI Soundtrack", "Christopher Tin"));
        songs.add(new Song("Battle Scars", "Paradise Fears"));
        songs.add(new Song( "Unknown", "K/DA"));
        songs.add(new Song("My Hero Academia Soundtrack", "Yuki Hayashi"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
