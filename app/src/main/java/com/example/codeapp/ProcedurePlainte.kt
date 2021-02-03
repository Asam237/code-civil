package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class ProcedurePlainte : AppCompatActivity() {

    lateinit var viewFirstBack : View;
    lateinit var clContactHuissier: ConstraintLayout;
    lateinit var clContactGendarmerie: ConstraintLayout;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedure_plainte)

        clContactGendarmerie = findViewById(R.id.clContactGendarmerie)
        clContactHuissier = findViewById(R.id.clContactHuissier)

        clContactGendarmerie.setOnClickListener {
            val text:String = "En cours de creation !"
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        }

        clContactHuissier.setOnClickListener {
            val text:String = "En cours de creation !"
            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        }

        viewFirstBack = findViewById(R.id.viewFirstBack);
        viewFirstBack.setOnClickListener {
            val intent = Intent(this, CadDeVol::class.java)
            startActivity(intent)
        }
    }
}