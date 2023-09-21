package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.SeekBar

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

        findViewById<ImageView>(R.id.imgMute).setOnClickListener {
            findViewById<SeekBar>(R.id.barVolume).setProgress(0)
        }
        findViewById<ImageView>(R.id.imgMaxVol).setOnClickListener {
            findViewById<SeekBar>(R.id.barVolume).setProgress(100)
        }
    }
}