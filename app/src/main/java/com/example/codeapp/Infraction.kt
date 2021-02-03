package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class Infraction : AppCompatActivity() {

    lateinit var viewFirstHome: View;
    lateinit var clFirstSecund: ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infraction)

        viewFirstHome = findViewById(R.id.viewFirstHome);
        clFirstSecund = findViewById(R.id.clFirstSecund)

        viewFirstHome.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }

        clFirstSecund.setOnClickListener {
            val intent = Intent(this, DelitMineur::class.java)
            startActivity(intent)
        }

    }
}