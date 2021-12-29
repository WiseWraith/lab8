package com.example.gameb.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gameb.R
import com.example.gameb.adapter.ReviewAdapter
import com.example.gameb.adapter.ShopAdapter
import com.example.gameb.data.DataSource

class ReviewsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)
        val rvReview = findViewById<RecyclerView>(R.id.rvReview)
        rvReview.layoutManager = LinearLayoutManager(this)
        rvReview.adapter = ReviewAdapter(DataSource.Reviews) {}
    }
}