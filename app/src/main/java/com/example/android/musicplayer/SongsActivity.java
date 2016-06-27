package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        View songList = (View)findViewById(R.id.song_list);
        if (songList != null) {
            songList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent playerIntent = new Intent(SongsActivity.this, PlayerActivity.class);
                    startActivity(playerIntent);
                }
            });
        }
    }
}
