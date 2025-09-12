package com.mycir.kodiproxy

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Launch real Kodi (Play Store version)
        val kodiIntent: Intent? = packageManager.getLaunchIntentForPackage("org.xbmc.kodi")
        if (kodiIntent != null) {
            startActivity(kodiIntent)
        }

        // Close proxy immediately
        finish()
    }
}
