package com.dicoding.umarelvaruq.suikov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailStar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_star)

        val tvName: TextView = findViewById(R.id.name)
        val name = intent.getStringExtra(EXTRA_NAME)
        tvName.text = name

        val tvRecruit: TextView = findViewById(R.id.recruit)
        val recruit = intent.getStringExtra(EXTRA_RECRUIT)
        tvRecruit.text = recruit

        val imgPhoto: ImageView = findViewById(R.id.picture)
        val photo = intent.getIntExtra(EXTRA_IMAGE,0)
        imgPhoto.setImageResource(photo)
    }
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_RECRUIT = "extra_recruit"
        const val EXTRA_IMAGE = "extra_image"
    }
}
