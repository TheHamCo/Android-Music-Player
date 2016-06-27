package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlbumDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        View albumSongList = (View) findViewById(R.id.album_song_list);
        if (albumSongList != null) {
            albumSongList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent playerIntent = new Intent(AlbumDetailActivity.this, PlayerActivity.class);

                    // Start the new activity
                    startActivity(playerIntent);
                }
            });
        }
    }
}
