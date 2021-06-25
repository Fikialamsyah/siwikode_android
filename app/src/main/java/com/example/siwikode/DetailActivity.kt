package com.example.siwikode

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.siwikode.model.Travel

class DetailActivity : AppCompatActivity() {
    private var travel: Travel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //  instance action bar
        val actionBar = supportActionBar
        actionBar?.setHomeAsUpIndicator(R.drawable.outline_arrow_back_ios_white_24)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.title = "Home"

        travel = intent.getParcelableExtra(MainActivity.INTENT_PARCELABLE)
        val tvTitle: TextView = findViewById(R.id.tv_title)
        val tvType: TextView = findViewById(R.id.tv_type)
        val tvDesc: TextView = findViewById(R.id.tv_desc)
        val tvRate: TextView = findViewById(R.id.tv_rate)
        val tvOpen: TextView = findViewById(R.id.tv_open)
        val tvAddress: TextView = findViewById(R.id.tv_address)
        val tvPhone: TextView = findViewById(R.id.tv_phone)
        val imgTravel: ImageView = findViewById(R.id.img_travel)
        val imgTravel1: ImageView = findViewById(R.id.img_travel1)
        val imgTravel2: ImageView = findViewById(R.id.img_travel2)
        val imgTravel3: ImageView = findViewById(R.id.img_travel3)
        val btnMaps: Button = findViewById(R.id.btn_maps)

        tvTitle.text = travel?.travelTitle
        tvType.text = travel?.travelType
        tvDesc.text = travel?.travelDesc
        tvRate.text = travel?.travelRate
        tvOpen.text = travel?.travelOpens
        tvAddress.text = travel?.travelAddress
        tvPhone.text = travel?.travelPhones

        Glide.with(imgTravel)
            .load(travel?.imgUrls1)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(imgTravel)

        Glide.with(imgTravel1)
            .load(travel?.imgUrls1)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(imgTravel1)

        Glide.with(imgTravel2)
            .load(travel?.imgUrls2)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(imgTravel2)

        Glide.with(imgTravel3)
            .load(travel?.imgUrls3)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_image_24)
            .into(imgTravel3)

        btnMaps.setOnClickListener {
            val mapsUrl = Uri.parse(travel?.travelMaps)
            val intent = Intent(Intent.ACTION_VIEW, mapsUrl)
            intent.setPackage("com.google.android.apps.maps")
            startActivity(intent)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_share, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            // share maps to another app
            R.id.share -> {
                val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Share From SIWIKODE\nAlamat ${travel?.travelTitle} :\n${travel?.travelMaps}"
                )
                intent.type = "text/*"
                startActivity(Intent.createChooser(intent, "Share destination to..."))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    // if arrow back pressed
    override fun onSupportNavigateUp(): Boolean {
        // move to main activity
        onBackPressed()
        return true
    }

}