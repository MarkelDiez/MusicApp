package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var play: ImageButton = findViewById(R.id.btnPlayPause)
        var playing:Boolean = true
        play.setOnClickListener {
            if(playing){
                play.setImageResource(android.R.drawable.ic_media_pause)
                playing = false
            } else {
                play.setImageResource(android.R.drawable.ic_media_play)
                playing = true
            }
        }
    }
}