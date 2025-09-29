package com.codepath.campgrounds

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

private const val TAG = "CampgroundDetailActivity"
// const val CAMPGROUND_EXTRA = "CAMPGROUND_EXTRA" // Removed to resolve conflict; uses definition from CampgroundAdapter.kt

class DetailActivity : AppCompatActivity() {
    private lateinit var campgroundNameTV: TextView
    private lateinit var campgroundDescriptionTV: TextView
    private lateinit var campgroundLatLongTV: TextView
    private lateinit var campgroundImageIV: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the remaining Views for the screen
        campgroundNameTV = findViewById(R.id.campgroundName)
        campgroundDescriptionTV = findViewById(R.id.campgroundDescription)
        campgroundLatLongTV = findViewById(R.id.campgroundLocation)
        campgroundImageIV = findViewById(R.id.campgroundImage)


        // TODO: Get the extra from the Intent
        // Assuming CAMPGROUND_EXTRA is accessible from CampgroundAdapter.kt due to same package
        val campground = intent.getSerializableExtra(CAMPGROUND_EXTRA) as Campground


        // TODO:  Set the name, location, and description information
        campgroundNameTV.text = campground.name
        campgroundDescriptionTV.text = campground.description
        campgroundLatLongTV.text = campground.latLong


        // TODO: Load the image using Glide
        Glide.with(this)
            .load(campground.imageUrl)
            .into(campgroundImageIV)

    }
}
