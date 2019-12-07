package com.example.openglmusicvisualizer;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MusicView musicView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        setContentView(R.layout.activity_main);
        musicView =(MusicView) findViewById(R.id.musicView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        musicView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        musicView.onPause();
    }


}
