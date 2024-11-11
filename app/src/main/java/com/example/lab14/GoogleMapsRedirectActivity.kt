package com.example.lab14

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GoogleMapsRedirectActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mapsIntent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Google+Maps"))
        startActivity(mapsIntent)
        finish()
    }
}
