package com.example.codeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DelitMineur : AppCompatActivity() {

    lateinit var viewFirstBack : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delit_mineur)

        viewFirstBack = findViewById(R.id.viewFirstBack)

    }
}