package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class DelitMineur : AppCompatActivity() {

    lateinit var viewFirstBack : View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delit_mineur)

        val btnDeliMineur = findViewById<Button>(R.id.btnMineur)
        val btnDeliMajeur = findViewById<Button>(R.id.btnMajeur)

        btnDeliMineur.setOnClickListener {
            val intent = Intent(this, Delit::class.java)
            startActivity(intent);
        }

        btnDeliMajeur.setOnClickListener {
            val intent = Intent(this, DelitMajeur::class.java);
            startActivity(intent);
        }

        viewFirstBack = findViewById(R.id.viewFirstBack)

    }
}