package com.example.codeapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class FirstHome : AppCompatActivity() {

    lateinit var lyFirstFirst: LinearLayout;
    lateinit var lyFirstSecund: LinearLayout;
    lateinit var lyFirstThird: LinearLayout;
    lateinit var IvFirstHelp : View;
    lateinit var lyFiveF : LinearLayout;
    lateinit var lyFirstFour : LinearLayout;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_home)

        IvFirstHelp = findViewById(R.id.viewFirstHelp)
        lyFirstFirst = findViewById(R.id.lyFirstFirst)
        lyFirstThird = findViewById(R.id.lyFirstThird)
        lyFiveF = findViewById(R.id.lyFirstF)
        lyFirstFour = findViewById(R.id.lyFirstFour);
        lyFirstSecund = findViewById(R.id.lyFirstSecund);

        lyFirstSecund.setOnClickListener {
            Toast.makeText(this, "En cours de creation..", Toast.LENGTH_LONG).show()
        }

        lyFiveF.setOnClickListener {
            val intent = Intent(this, Plainte::class.java)
            startActivity(intent)
        }

        lyFirstFour.setOnClickListener {
            val intent = Intent(this, Infraction::class.java)
            startActivity(intent)
        }

        lyFirstFirst.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

       lyFirstThird.setOnClickListener {
            val intent = Intent(this, Consultation::class.java)
            startActivity(intent)
        }

        IvFirstHelp.setOnClickListener {
            val intent = Intent(this, Help::class.java)
            startActivity((intent))
        }

    }
}