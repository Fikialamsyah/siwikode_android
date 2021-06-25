package com.example.siwikode

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.siwikode.adapter.TravelAdapter
import com.example.siwikode.data.TravelData
import com.example.siwikode.model.Travel

class MainActivity : AppCompatActivity() {
    private var pressedTime: Long = 0
    private lateinit var rvTravel: RecyclerView
    private var travelList: ArrayList<Travel> = arrayListOf()

    // variable for send data to another activity
    companion object {
        const val INTENT_PARCELABLE = "OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialized recyclerview
        rvTravel = findViewById(R.id.rv_travel)
        travelList.addAll(TravelData.listData)
        rvTravel.setHasFixedSize(true)
        showRecycleList()
    }

    private fun showRecycleList() {
        rvTravel.layoutManager = LinearLayoutManager(this)
        val travelAdapter = TravelAdapter(travelList)
        rvTravel.adapter = travelAdapter
        travelAdapter.setOnItemClickCallBack(object : TravelAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Travel) {
                // call function showSelectedItem
                showSelectedItem(data)
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                // send data to detail activity
                intent.putExtra(INTENT_PARCELABLE, data)
                startActivity(intent)
            }
        })
    }


    // method to show if item selected
    fun showSelectedItem(travel: Travel) {
        // create toast
        Toast.makeText(this, "You choose " + travel.travelTitle, Toast.LENGTH_SHORT).show()
    }

    override fun onBackPressed() {
        // if user pressed button > current time
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            // exit app
            super.onBackPressed()
            finish()
            // if user pressed button < current time
        } else {
            //  toast to trigger user to press back again
            Toast.makeText(baseContext, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        pressedTime = System.currentTimeMillis()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // inflate menu profile to layout
        menuInflater.inflate(R.menu.menu_profile, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // conditional with item id as case
        return when (item.itemId) {
            // if id item = profile
            R.id.profile -> {
                // intent to profile activity
                val intent = Intent(this, ProfileActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

