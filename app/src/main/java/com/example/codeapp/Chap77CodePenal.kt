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

class Chap77CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap77_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 275 — Meurtre.", "Est puni d'un emprisonnement à vie celui qui cause la mort d'autrui."))
        chapter.add(Chapter("Article 276 — Assassinat.", "    (1) Est puni de mort le meurtre commis soit : \n" +
                "        a) Avec préméditation ; \n" +
                "        b) Par empoisonnement ; \n" +
                "        c) Pour préparer, faciliter ou exécuter un crime ou un délit, ou pour favoriser la fuite ou assurer l'impunité des auteurs ou complices de ce crime ou de ce délit. \n" +
                "    (2) Il y a préméditation même si l'identité de la victime n'est pas déterminée, et même si l'auteur subordonne son projet à la réalisation d'une condition quelconque. "))
        chapter.add(Chapter("Article 277 — Blessures graves.", "Est puni d'un emprisonnement de dix à vingt ans celui qui cause à autrui la privation permanente de l'usage de tout ou partie d'un membre, d'un organe ou d'un sens."))
        chapter.add(Chapter("Article 278 — Coups mortels.", "    (1) Est puni d'un emprisonnement de six à vingt ans celui qui, par des violences ou des voies de fait, cause involontairement la mort d'autrui. \n" +
                "    (2) La peine est l'emprisonnement à vie au cas où les violences ou les voies de fait sont exercées au cours d'une pratique de sorcellerie, magie ou divination."))
        chapter.add(Chapter("Article 279 — Coups avec blessures graves.", "    (1) Est puni d'un emprisonnement de cinq à dix ans et s'il y a lieu d'une amende de 5.000 à 500.000 francs celui qui, par des violences ou des voies de fait, cause involontairement à autrui des blessures telles que prévues à l'article 277. \n" +
                "    (2) L'emprisonnement est de six à quinze ans lorsqu'il est fait usage d'une arme ou d'une substance explosive, corrosive ou toxique ou d'un poison ou d'un procédé de sorcellerie, magie ou divination."))
        chapter.add(Chapter("Article 280 — Blessures simples.", "Est puni d'un emprisonnement de six mois à cinq ans et d'une amende de 5.000 à 200.000 francs ou de l'une de ces deux peines seulement celui qui, par des violences ou des voies de fait, cause même involontairement à autrui une maladie ou une incapacité de travail supérieure à trente jours. "))

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
                val intent = Intent(this, Chap88CodePenal::class.java)
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