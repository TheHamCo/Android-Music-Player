package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recently Played Routing
        TextView recentlyPlayed = (TextView)findViewById(R.id.recently_played);
        if (recentlyPlayed != null) {
            recentlyPlayed.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent recentlyPlayedIntent = new Intent(MainActivity.this, PlaylistsOrAlbumsActivity.class);

                    // Start the new activity
                    startActivity(recentlyPlayedIntent);
                }
            });
        }

        //Artists Routing
        TextView artists = (TextView)findViewById(R.id.artists);
        if (artists != null) {
            artists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent artistsIntent = new Intent(MainActivity.this, AlbumDetailActivity.class);

                    // Start the new activity
                    startActivity(artistsIntent);
                }
            });
        }

        //Albums Routing
        TextView  albums = (TextView)findViewById(R.id.albums);
        if (albums != null) {
            albums.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent albumsIntent = new Intent(MainActivity.this, PlaylistsOrAlbumsActivity.class);

                    // Start the new activity
                    startActivity(albumsIntent);
                }
            });
        }

        //Songs Routing
        TextView songs = (TextView)findViewById(R.id.songs);
        if (songs != null) {
            songs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                    // Start the new activity
                    startActivity(songsIntent);
                }
            });
        }

        //Playlists Routing
        TextView playlists = (TextView)findViewById(R.id.playlists);
        if (playlists != null) {
            playlists.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsOrAlbumsActivity.class);

                    // Start the new activity
                    startActivity(playlistsIntent);
                }
            });
        }
    }
}
