package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class Livres : AppCompatActivity() {

    lateinit var clFirst: ConstraintLayout;
    lateinit var clSecund: ConstraintLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livres)

        clFirst = findViewById(R.id.clFirstSecund);
        clSecund = findViewById(R.id.clFirstThird);


        clSecund.setOnClickListener {
            val intent = Intent(this, Livre2Titre::class.java)
            startActivity(intent)
        }

        clFirst.setOnClickListener {
            val intent = Intent(this, Livre1Titre::class.java)
            startActivity(intent)
        }

    }
}