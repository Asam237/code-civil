package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class LivreTravail : AppCompatActivity() {
    lateinit var clFirst: ConstraintLayout;
    lateinit var clSecund: ConstraintLayout;
    lateinit var clFirstFour: ConstraintLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livre_travail)


        clFirst = findViewById(R.id.clFirstSecund);
        clSecund = findViewById(R.id.clFirstThird);

        //Livre a creer
        clFirstFour = findViewById(R.id.clFirstFour)


        clSecund.setOnClickListener {
            val intent = Intent(this, Tra2Chap::class.java)
            startActivity(intent)
        }

        clFirst.setOnClickListener {
            val intent = Intent(this, Tra1Chap::class.java)
            startActivity(intent)
        }

        clFirstFour.setOnClickListener {
            val intent = Intent(this, Tra3Chap::class.java)
            startActivity(intent)

        }
    }
}