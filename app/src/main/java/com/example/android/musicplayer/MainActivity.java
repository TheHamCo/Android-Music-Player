package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
                    Log.v("Clicklistener","CLICKED!");
                    // Create a new intent to open the {@link FamilyActivity}
                    Intent recentlyPlayedIntent = new Intent(MainActivity.this, RecentlyPlayedActivity.class);

                    // Start the new activity
                    startActivity(recentlyPlayedIntent);
                }
            });
        }
    }
}
