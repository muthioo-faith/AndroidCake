package com.example.instagramapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnlogin:Button
    lateinit var btnsign:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnlogin=findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener {
            val intent= Intent(this,signup::class.java)
            startActivity(intent)
            }
            btnsign=findViewById(R.id.btnsign)
            btnsign.setOnClickListener {
            var intent=Intent(this,login::class.java)
            startActivity(intent)
        }
        }


    }
