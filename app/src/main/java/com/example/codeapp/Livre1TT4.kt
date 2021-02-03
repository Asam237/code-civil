package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class Livre1TT4 : AppCompatActivity() {

    lateinit var clFirstSecund: ConstraintLayout;
    lateinit var clFirstThird: ConstraintLayout;
    lateinit var clFirstFour: ConstraintLayout;
    lateinit var firstHome: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livre1_t_t4)

        clFirstSecund = findViewById(R.id.clFirstSecund)
        firstHome = findViewById(R.id.viewFirstHome)


        firstHome.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }

        clFirstSecund.setOnClickListener {
            val intent = Intent(this,Chap10CodePenal::class.java)
//            intent.putExtra("ViewType", "assets")
            startActivity(intent)
        }

    }
}