package com.example.playlistmaker
import android.content.Intent
import android.widget.Toast
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.search)

        val buttonClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val buttonIntent = Intent(this@MainActivity, Search_Activity::class.java)
                startActivity(buttonIntent)
            }
        }

        button.setOnClickListener(buttonClickListener)

        val mediaButton = findViewById<Button>(R.id.media)
        mediaButton.setOnClickListener {
            val mediaButtonIntent = Intent(this, Media_Activity::class.java)
            startActivity(mediaButtonIntent)
        }

        val settingsButton = findViewById<Button>(R.id.settings)
        settingsButton.setOnClickListener {
            val settingsButtonIntent = Intent(this, SettingsActivity::class.java)
            startActivity(settingsButtonIntent)
        }
    }
}
