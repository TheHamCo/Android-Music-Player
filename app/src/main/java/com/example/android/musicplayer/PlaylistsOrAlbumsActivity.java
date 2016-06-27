package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlaylistsOrAlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists_or_albums);

        View playlistOrAlbum = (View)findViewById(R.id.playlist_or_album);
        if (playlistOrAlbum != null) {
            playlistOrAlbum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent albumDetailIntent = new Intent(PlaylistsOrAlbumsActivity.this, AlbumDetailActivity.class);

                    // Start the new activity
                    startActivity(albumDetailIntent);
                }
            });
        }
    }
}
