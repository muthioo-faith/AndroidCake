package com.example.instagramapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Categories : AppCompatActivity() {
lateinit var btnmore:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        btnmore=findViewById(R.id.btnmore)
        btnmore.setOnClickListener {
            var intent=Intent(this,Beauty::class.java)
            startActivity(intent)
        }

    }
}