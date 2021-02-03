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

class Chap4CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap4_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 17 — Légalité des peines et des infractions.", "Les peines et les mesures sont fixées par la loi et ne sont prononcées qu'à raison des infractions légalement prévues."))
        chapter.add(Chapter("Article 18 — Peines principales.", "Les peines principales sont : \n" +
                "        ◦ La peine de mort ; - L'emprisonnement \n" +
                "        ◦ L'amende. "))
        chapter.add(Chapter("Article 19 — Peines accessoires.", "Les peines accessoires sont : \n" +
                "        ◦ Les déchéances ; \n" +
                "        ◦ La publication du jugement ; - La fermeture de l'établissement ; \n" +
                "        ◦ La confiscation. "))
        chapter.add(Chapter("Article 20 — Mesures de sûreté.", "Les mesures de sûreté sont : \n" +
                "        ◦ L'interdiction d'exercice de la profession ; \n" +
                "        ◦ La relégation ; \n" +
                "        ◦ Les mesures de surveillance et d'assistance post-pénales ; \n" +
                "        ◦ L'internement dans une maison de santé ; \n" +
                "        ◦ La confiscation. "))
        chapter.add(Chapter("Article 21 — Classification des infractions.", "    (1) Les infractions sont classées en crimes, délits et contraventions selon les peines principales qui les sanctionnent : \n" +
                "        a) Sont qualifiées crimes les infractions punies de la peine de mort ou d'une peine privative de liberté dont le maximum est supérieur à dix ans ; \n" +
                "        b) Sont qualifiées délits les infractions punies d'une peine privative de liberté ou d'une amende lorsque la peine privative de liberté encourue est supérieure à dix jours et n'excède pas dix ans ou que le maximum de l'amende est supérieur à 25.000 francs \n" +
                "        c) Sont qualifiées contraventions les infractions punies d'un emprisonnement qui ne peut excéder dix jours ou d'une amende qui ne peut excéder 25.000 francs. \n" +
                "    (2) La nature d'une infraction n'est pas modifiée : \n" +
                "        a) lorsque par suite de l'admission d'une excuse ou de circonstances atténuantes la peine prononcée est celle afférente à une autre catégorie d'infractions ; \n" +
                "        b) Dans les cas d'aggravation prévus aux article 88 et 89 du présent code."))

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
                val intent = Intent(this, Chap5CodePenal::class.java)
                startActivity(intent)
            }
            R.id.home -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }
//            R.id.chap3 -> {
////                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
//                val intent = Intent(this, Chap6CodePenal::class.java)
//                startActivity(intent)
//            }
        }

        return super.onOptionsItemSelected(item)
    }
}