package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import android.content.Intent

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var name = intent.extras?.getString("ba")
        var tvHome = findViewById<TextView>(R.id.tvHome)
        tvHome.text = name
    }
    fun handleClick(view: android.view.View) {
        var intent: Intent
        intent = Intent(this,MainActivity::class.java)
        intent.putExtra("ap","avichal pathak")
        startActivity(intent)
    }
}