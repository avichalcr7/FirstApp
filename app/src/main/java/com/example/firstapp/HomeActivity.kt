package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.TextView
import android.content.Intent
import android.net.Uri
import android.view.View

class HomeActivity : AppCompatActivity() {

    lateinit var tvHome:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var name = intent.extras?.getString("ba")
        tvHome = findViewById(R.id.tvHome)
        tvHome.text = name
    }
    fun handleClick(view: android.view.View) {
        when(view.id){
            R.id.btnSend -> { startDialer()}
            R.id.btnMain -> { startMain()}
        }
        //startMain()
        //startDialer()
    }

    private fun startDialer() {
        var dialIntent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:8299266615"))
        startActivity(dialIntent)
    }

    private fun startMain() {
            var intent: Intent
            intent = Intent(this, MainActivity::class.java)
            intent.putExtra("ap", "avichal pathak")
            startActivityForResult(intent,123)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK && requestCode == 123){
            tvHome.text = data?.extras?.getString("con")
        }
    }
}