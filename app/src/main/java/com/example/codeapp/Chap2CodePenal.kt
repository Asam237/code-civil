package com.example.codeapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chap2CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap2_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 3 — Non-rétroactivité.", "Ne sont pas soumis à la loi pénale les faits commis antérieurement à son entrée en vigueur ou ceux qui n'ont pas été jugés avant son abrogation expresse ou tacite.\n\n\n"))
        chapter.add(Chapter("Article 4 — Loi moins rigoureuse.", "    (1) Toute disposition pénale nouvelle et moins rigoureuse s'applique aux infractions non définitivement jugées au jour de son entrée en vigueur. \n\n\n" +
                "    (2) Si la disposition nouvelle est plus rigoureuse, les infractions commises avant son entrée en vigueur continuent à être jugées conformément à la loi ancienne. "))
        chapter.add(Chapter("Article 5 — Nouvelle mesure de sûreté.", "Toute loi édictant une mesure de sûreté est applicable aux faits non définitivement jugés au jour de son entrée en vigueur.\n\n\n"))
        chapter.add(Chapter("Article 6 — Abolition de l'infraction, de la peine ou de la mesure.", "Cesse immédiatement de recevoir exécution toute peine ou mesure de sûreté : \n\n\n" +
                "        a) Prononcée à raison d'un fait qui ne constitue plus une infraction ; \n\n\n" +
                "        b) Abolie postérieurement à la condamnation. \n"))

        var adapter = CustomAdapter(chapter)

        rv.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_pan_chap_two, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.chapt1 ->{
                val intent = Intent(this, Chap1CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Chap3CodePenal::class.java)
                startActivity(intent)
            }
            R.id.home -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }
        }

        return super.onOptionsItemSelected(item)
    }
}