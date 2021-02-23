package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class Infraction : AppCompatActivity() {

    lateinit var viewFirstHome: View;
    lateinit var clFirstSecund: ConstraintLayout;
    lateinit var clFirstFour: ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_infraction)

        viewFirstHome = findViewById(R.id.viewFirstHome);
        clFirstSecund = findViewById(R.id.clFirstSecund)
        clFirstFour = findViewById(R.id.clFirstFour);


        clFirstFour.setOnClickListener {
            val intent = Intent(this, Contravention::class.java)
            startActivity(intent)
        }

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