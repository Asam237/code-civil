package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class Plainte : AppCompatActivity() {


    lateinit var viewFirstHome: View;
    lateinit var clFirstSecund : ConstraintLayout;
    lateinit var viewSearch: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plainte)

        viewSearch = findViewById(R.id.viewFirstSearch);
        clFirstSecund = findViewById(R.id.clFirstSecund);
        viewFirstHome = findViewById(R.id.viewFirstHome);

        viewFirstHome.setOnClickListener {
            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }

        clFirstSecund.setOnClickListener {
            val intent = Intent(this, CadDeVol::class.java)
            startActivity(intent)
        }

        viewSearch.setOnClickListener {
            val text:String="En cours de creation.."
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        }

    }
}