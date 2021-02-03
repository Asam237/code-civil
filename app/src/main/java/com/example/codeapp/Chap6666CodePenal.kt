package com.example.codeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chap6666CodePenal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap6666_code_penal)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 1 — Aucune exemption.", "La loi pénale s'impose à tous. "))
        chapter.add(Chapter("Article 2 — Application générale et spéciale.", "(1) Les règles de droit international ainsi que les traités dûment promulgués et publiés s'imposent au présent code ainsi qu'à toute disposition pénale. \n\n\n" +
                "(2) (Loi n° 67-LF-1 du 12 juin 1967) : Le présent livre s'impose à toute autre disposition pénale sauf disposition spéciale visant notamment l'interdiction du sursis et l'interdiction ou la limitation des circonstances atténuantes édictées même antérieurement à l'entrée en vigueur du présent livre, par une loi ou par un texte réglementaire ayant portée législative. Le présent alinéa rétroagit au 1er octobre 1966 inclusivement. \n\n\n" +
                "(3) Lorsqu'une même matière fait l'objet à la fois d'une disposition générale non comprise dans le présent livre et d'une disposition spéciale, cette dernière est seule applicable s'il n'en a pas été autrement disposé. \n\n\n"))

        var adapter = CustomAdapter(chapter)

        rv.adapter = adapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_pan_chap_one, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.chap2 -> {
//                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Chap5555CodePenal::class.java)
                startActivity(intent)
            }
            R.id.home -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }
//            R.id.chap3 -> {
//                val intent = Intent(this, Chap3CodePenal::class.java)
//                startActivity(intent)
//
//            }
        }

        return super.onOptionsItemSelected(item)
    }
}