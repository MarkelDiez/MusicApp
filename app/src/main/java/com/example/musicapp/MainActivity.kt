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

        val play: ImageButton = findViewById(R.id.btnPlayPause)
        var playing:Boolean = true
        play.setOnClickListener {
            playing = if(playing){
                play.setImageResource(android.R.drawable.ic_media_pause)
                false
            } else {
                play.setImageResource(android.R.drawable.ic_media_play)
                true
            }
        }

        findViewById<ImageView>(R.id.imgMute).setOnClickListener {
            findViewById<SeekBar>(R.id.barVolume).progress = 0
        }
        findViewById<ImageView>(R.id.imgMaxVol).setOnClickListener {
            findViewById<SeekBar>(R.id.barVolume).progress = 100
        }
    }
}