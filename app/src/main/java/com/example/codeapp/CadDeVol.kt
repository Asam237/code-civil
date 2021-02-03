package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class CadDeVol : AppCompatActivity() {

    lateinit var btnProcedure: Button;
    lateinit var viewFirstHome: View;
    lateinit var viewFirstBack: View;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_de_vol)

        viewFirstBack = findViewById(R.id.viewFirstBack)
        viewFirstHome = findViewById(R.id.viewFirstHome)

        viewFirstHome.setOnClickListener {

            val intent = Intent(this, FirstHome::class.java)
            startActivity(intent)
        }
        viewFirstBack.setOnClickListener {

            val intent = Intent(this, Plainte::class.java)
            startActivity(intent)
        }

        btnProcedure = findViewById(R.id.btnProcedure)
        btnProcedure.setOnClickListener {
            val intent = Intent(this, ProcedurePlainte::class.java)
            startActivity(intent)
        }
    }
}