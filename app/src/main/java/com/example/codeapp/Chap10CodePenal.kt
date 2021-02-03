package com.example.codeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chap10CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap10_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 89 — Fonctionnaires.", "    (1) Les infractions aux lois des Etats fédérés, non prévues ni sanctionnées par le présent code ou par d'autres lois fédérales, sont punies, si la loi fédérée le décide expressément, de peines égales ou inférieures à un an d'emprisonnement et d'une amende supérieure à vingt-cinq mille francs sans pouvoir excéder cinq cent mille francs, ou de l'une ou l'autre peine seulement. \n" +
                "    (2) Les infractions aux décrets ou arrêtés légalement pris en exécution des lois fédérées constituent des contraventions."))

        var adapter = CustomAdapter(chapter)

        rv.adapter = adapter
    }
}