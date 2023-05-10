package com.example.proyecto8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void presionGato(View v) {
            MediaPlayer mp = MediaPlayer.create(this, R.raw.sonido_gatos);
            mp.start();
            Toast.makeText(MainActivity.this, "Reproduciendo Audio ", Toast.LENGTH_SHORT).show();
        }

        public void presionleon(View v) {
            MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
            mp.start();
            Toast.makeText(MainActivity.this, "Reproduciendo Audio ", Toast.LENGTH_SHORT).show();
       }

    }
