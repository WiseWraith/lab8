package com.example.gameb.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gameb.R
import com.example.gameb.adapter.GameAdapter
import com.example.gameb.data.DataSource

class GamesActivity : Activity() {
    companion object{
        const val KEY_NAME = "name"
        const val KEY_DESCRIPTION = "description"
        const val KEY_ICON_RES_ID = "iconResId"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games)
        val rvGames = findViewById<RecyclerView>(R.id.rvGames)
        rvGames.layoutManager = LinearLayoutManager(this)
        rvGames.adapter = GameAdapter(DataSource.Game) { (model, description, iconResId) ->
            val intent = Intent(this, GamesActivity::class.java)
            intent.putExtra(KEY_NAME, model)
            intent.putExtra(KEY_DESCRIPTION, description)
            intent.putExtra(KEY_ICON_RES_ID, iconResId)
            startActivity(intent)
        }
    }
}