package com.mycir.kodiproxy

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import android.util.Log

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val launchKodi: Intent? = packageManager.getLaunchIntentForPackage("org.xbmc.kodi")
        launchKodi?.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        if (launchKodi != null) {
            startActivity(launchKodi)
            Log.d("KodiProxy", "Kodi launch OK via intent")
        } else {
            Log.e("KodiProxy", "Kodi not installed or no launch intent found")
        }
        finish()
    }
}
