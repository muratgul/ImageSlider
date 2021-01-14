package com.muratgul.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val locationsViewPager = findViewById<ViewPager2>(R.id.locationViewPager)

        val travelLocations = arrayListOf<TravelLocation>()

        travelLocations.add(TravelLocation("Fransa Alpleri", "France", R.drawable.ornek,2f))
        travelLocations.add(TravelLocation("Kanal", "İtalya", R.drawable.tunisia,4f))
        travelLocations.add(TravelLocation("Dağlar", "Tunus", R.drawable.tunisia,3f))
        travelLocations.add(TravelLocation("Gabar Çölü", "Fas", R.drawable.col,2.8f))

        val adapter = TravelLocationAdapter()

        adapter.setData(travelLocations)

        locationsViewPager.adapter = adapter

    }
}