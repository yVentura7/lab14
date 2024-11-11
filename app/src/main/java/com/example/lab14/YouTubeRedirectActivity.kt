package com.example.lab14

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri

class YouTubeRedirectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com"))
        startActivity(intent)
        finish() // Termina esta actividad después de lanzar YouTube
    }
}
