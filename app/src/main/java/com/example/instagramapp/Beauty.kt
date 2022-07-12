package com.example.instagramapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Beauty : AppCompatActivity() {
    lateinit var btnprevious:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beauty)
        btnprevious=findViewById(R.id.btnprevious)
        btnprevious.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}