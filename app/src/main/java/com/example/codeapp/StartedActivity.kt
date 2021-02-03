package com.example.codeapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartedActivity : AppCompatActivity() {
    lateinit var btnStart : Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_started)
        btnStart = findViewById(R.id.btnStart);

        btnStart.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
            finish()
        }

//        btnStart.setOnClickListener {
//            val intent = Intent(this, ViewActivity::class.java)
//            intent.putExtra("ViewType", "assets")
//            startActivity(intent)
//        }

    }
}