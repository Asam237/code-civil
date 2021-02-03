package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class Livre1TT1 : AppCompatActivity() {

    lateinit var clFirstSecund: ConstraintLayout;
    lateinit var clFirstThird: ConstraintLayout;
    lateinit var clFirstFour: ConstraintLayout;
    lateinit var firstHome: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livre1_t_t1)


        clFirstSecund = findViewById(R.id.clFirstSecund)
        clFirstThird = findViewById(R.id.clFirstThird)
        clFirstFour = findViewById(R.id.clFirstFour);
        firstHome = findViewById(R.id.viewFirstHome)


        firstHome.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }

        clFirstSecund.setOnClickListener {
            val intent = Intent(this, Chap1CodePenal::class.java)
//            intent.putExtra("ViewType", "assets")
            startActivity(intent)
        }

        //Chapitre 3
        clFirstFour.setOnClickListener {
            val intent = Intent(this, Chap3CodePenal::class.java)
//            intent.putExtra("ViewType", "assets")
            startActivity(intent)
        }

        clFirstThird.setOnClickListener {
            val intent = Intent(this, Chap2CodePenal::class.java)
//            intent.putExtra("ViewType", "assets")
            startActivity(intent)
        }

    }
}