package com.example.siwikode

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // instance actionBar
        val actionBar = supportActionBar
        actionBar?.setHomeAsUpIndicator(R.drawable.outline_arrow_back_ios_white_24) // custom icon arrow back
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "Home" // set title
    }

    // if arrow back pressed
    override fun onSupportNavigateUp(): Boolean {
        // move to main activity
        onBackPressed()
        return true
    }
}