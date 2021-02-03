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

class Chap22CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap22_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 122 — Fraudes électorales.", "    (1) Est puni de la détention de trois mois à deux ans et d'une amende de 10.000 à 100.000 francs ou de l'une de ces deux peines seulement celui qui à l'occasion d'une élection fédérale, fédérée ou communale : \n" +
                "        a) Viole le secret du vote ; \n" +
                "        b) Porte atteinte à sa sincérité \n" +
                "        c) Empêche les opérations de scrutin ; \n" +
                "        d) En modifie le résultat ; \n" +
                "    (2) Est puni de la détention de un mois ou un an et d'une amende de 5.000 à 50.000 francs ou de l'une de ces deux peines seulement celui qui par simple inobservation volontaire des dispositions légales ou réglementaires provoque non intentionnellement le même résultat. \n" +
                "    (3) L'action publique se prescrit après quatre mois révolus à compter du délit ou du jour du dernier acte de poursuite ou d'instruction. "))
        chapter.add(Chapter("Article 123 — Corruption et violences.", "    (1) Est puni de la détention de trois mois à deux ans et d'une amende de 10.000 à 100.000 francs ou de l'une de ces deux peines seulement celui qui : \n" +
                "        a) Par l'octroi ou par la promesse d'un avantage particulier de quelque nature qu'il soit, ou \n" +
                "        b) Par voies de fait ou menace d'un dommage particulier quelconque, influence le vote d'un électeur ou le détermine à s'abstenir. \n" +
                "    (2) Lorsque le vote influencé est celui d'un collège électoral ou d'une fraction de ce collège le minimum de la peine de détention est de six mois, et celui de l'amende de 20.000 francs."))
        chapter.add(Chapter("Article 124 — Contre les lois, le fonctionnement d'un service et la sûreté de l'Etat.", "    (1) Est puni de l'emprisonnement de six mois à trois ans tout individu dépositaire de quelque partie de l'autorité publique et tout fonctionnaire qui avec d'autres dépositaires ou fonctionnaires concerte ou délibère : \n" +
                "        a) Des mesures contraires aux lois ou aux textes d'application légalement pris ; \n" +
                "        b) Des mesures, y compris des démissions collectives, ayant pour objet principal d'empêcher ou de suspendre l'exécution d'un service public. \n" +
                "    (2) Si ce concert a lieu entre les autorités civiles et militaires l'emprisonnement est de un à dix ans. \n" +
                "    (3) Si le concert visé à l'alinéa 2 ci-dessus a pour objet un crime contre la Sûreté de l'Etat la peine est celle de mort."))
        chapter.add(Chapter("Article 125 — Sur le législatif.", "Est puni de l'emprisonnement de six mois à cinq ans tout fonctionnaire qui : \n" +
                "        a) S'immisce dans l'exercice du pouvoir législatif ; \n" +
                "        b) Refuse d'exécuter des dispositions législatives. "))
        chapter.add(Chapter("Article 126 — De l'exécutif et du judiciaire.", "Est puni de l'emprisonnement de six mois à cinq ans : \n" +
                "        a) Le représentant de l'autorité exécutive qui intime des ordres ou des défenses à des cours ou tribunaux ; \n" +
                "        b) Le magistrat qui intime des ordres ou des défenses à des autorités exécutives ou administratives."))
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
                val intent = Intent(this, Chap11CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Chap33CodePenal::class.java)
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