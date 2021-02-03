package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Livre1Titre : AppCompatActivity() {
    lateinit var clFirstThird: ConstraintLayout;
    lateinit var clFirstSecund : ConstraintLayout;
    lateinit var clFirstFour : ConstraintLayout;
    lateinit var clFirstFive : ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livre1_titre)

        clFirstSecund = findViewById(R.id.clFirstSecund)
        clFirstThird = findViewById(R.id.clFirstThird)
        clFirstFour = findViewById(R.id.clFirstFour)
        clFirstFive = findViewById(R.id.clFirstFive)

        clFirstSecund.setOnClickListener {
            val intent = Intent(this, Livre1TT1::class.java)
            startActivity(intent)
        }

        clFirstFive.setOnClickListener {
            val intent = Intent(this, Livre1TT4::class.java)
            startActivity(intent)
        }

        clFirstFour.setOnClickListener {
            val intent = Intent(this, Livre1TT3::class.java )
            startActivity(intent)
        }

        clFirstThird.setOnClickListener {
            val intent = Intent(this, Livre1TT2::class.java)
            startActivity(intent)
        }

    }
}