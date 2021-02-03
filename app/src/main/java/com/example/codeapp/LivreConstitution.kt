package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class LivreConstitution : AppCompatActivity() {
    lateinit var clFirst: ConstraintLayout;
    lateinit var clSecund: ConstraintLayout;
    lateinit var clFirstFour: ConstraintLayout;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livre_constitution)

        clFirst = findViewById(R.id.clFirstSecund);
        clSecund = findViewById(R.id.clFirstThird);

        //Livre a creer
        clFirstFour = findViewById(R.id.clFirstFour)


        clSecund.setOnClickListener {
            val intent = Intent(this, Const2Chap::class.java)
            startActivity(intent)
        }

        clFirst.setOnClickListener {
            val intent = Intent(this, Const1Chap::class.java)
            startActivity(intent)
        }

        clFirstFour.setOnClickListener {
            val intent = Intent(this, Const3Chap::class.java)
            startActivity(intent)

        }
    }
}