package com.example.gameb.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.gameb.R

class AuthActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.auth)
    }
    fun clicktoreg(v:View)
    {
        val intent = Intent(this, RegistrationActivity::class.java)
        startActivity(intent)
    }


}