package com.example.instagramapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup : AppCompatActivity() {
    lateinit var btnsearch:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btnsearch=findViewById(R.id.btnsearch)
        btnsearch.setOnClickListener {
            var intent=Intent(this,Categories::class.java)
            startActivity(intent)
        }

        }

}