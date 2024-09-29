package com.sarcb.flixsterplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) { // Only add the fragment if this is the first creation
            val supportFragmentManager = supportFragmentManager
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.content, NowPlayingFragment(), null)
            fragmentTransaction.addToBackStack(null) // Add the transaction to the back stack
            fragmentTransaction.commit()
        }
    }
}
