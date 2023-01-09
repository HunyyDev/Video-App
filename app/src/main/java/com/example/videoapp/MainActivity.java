package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView vdvSample, vdvSample2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiate();

        //display from local store
        MediaController mc = new MediaController(this);
        mc.setAnchorView(vdvSample);
        vdvSample.setMediaController(mc);

        //display from internet
        Uri uri = Uri.parse("https://static.videezy.com/system/resources/previews/000/002/231/original/5226496.mp4");
        vdvSample2.setVideoURI(uri);
        MediaController mc2 = new MediaController(this);
        mc.setAnchorView(vdvSample2);
        vdvSample2.setMediaController(mc2);
    }

    private void initiate() {
        vdvSample = findViewById(R.id.vdvSample);
        vdvSample2 = findViewById(R.id.vdvSample2);
        vdvSample.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
    }
}