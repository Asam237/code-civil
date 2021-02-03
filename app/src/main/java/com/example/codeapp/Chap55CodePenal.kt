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

class Chap55CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap55_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 231 — Réunion et manifestation.", "Est puni d'un emprisonnement de quinze jours à six mois et d'une amende de 5.000 à 100.000 francs celui qui : \n" +
                "        a) Participe à l'organisation de toute réunion ou manifestation dans un lieu ouvert au public sans avoir fait la déclaration éventuellement requise ou avant l'expiration du préavis requis, ou après notification de l'interdiction légale ; \n" +
                "        b) Avant ladite déclaration ou après ladite interdiction adresse par quelque moyen que ce soit une convocation pour y prendre part ; \n" +
                "        c) Fait une déclaration de nature à tromper les autorités sur les conditions ou l'objet de la réunion ou de la manifestation projetée."))
        chapter.add(Chapter("Article 232 — Attroupement.", "    (1) L'attroupement s'entend de toute réunion sur la voie publique d'au moins cinq personnes, de nature à troubler la paix publique. \n" +
                "    (2) Est puni d'un emprisonnement de quinze jours à six mois celui qui faisant partie d'un attroupement ne s'en retire pas à la première sommation de l'autorité compétente. \n" +
                "    (3) Si l'attroupement n'a pu être dispersé que par la force la peine est doublée contre ceux qui s'y sont maintenus. \n" +
                "Article 233 — Attroupement armé. \n" +
                "    (1) Est puni d'un emprisonnement de trois mois à deux ans celui qui faisant partie d'un attroupement armé au sens des articles 115 (3) et 117 du présent code, porte lui-même une arme ou ne s'en retire pas à la première sommation de l'autorité compétente. \n" +
                "    (2) La peine est de deux à cinq ans d'emprisonnement contre celui qui demeure dans l'attroupement jusqu'à sa dissolution par la force. \n" +
                "    (3) La peine est de cinq à dix ans d'emprisonnement contre celui qui fait partie de l'attroupement au moment où l'un ou plusieurs membres font usage de leurs armes. \n" +
                "    (4) Les peines du présent article sont doublées au cas où l'attroupement a lieu pendant la nuit. \n" +
                "    (5) La juridiction peut en outre prononcer les déchéances de l'article 30 du présent Code."))
        chapter.add(Chapter("Article 234 — Caractère politique.", "Dans les cas visés aux articles 231, 232 et 233 la détention est substituée à l'emprisonnement si l'infraction revêt un caractère politique. "))
        chapter.add(Chapter("Article 235 — Cris séditieux.", "Est puni de la détention de huit jours à un mois et d'une amende de 2.000 à 50.000 francs ou de l'une de ces deux peines seulement celui qui profère dans un lieu ouvert au public des cris ou chants séditieux."))
        chapter.add(Chapter("Article 236 — Pillage en bande.", "    (1) Est puni d'un emprisonnement de dix à vingt ans celui qui en réunion ou bande et à force ouverte, pille ou détériore des biens mobiliers ou immobiliers. \n" +
                "    (2) La peine est l'emprisonnement à vie si le crime est commis pendant l'état d'urgence ou d'exception. \n" +
                "    (3) La peine est la mort si le crime est commis en temps de guerre."))
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
                val intent = Intent(this, Chap44CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Chap66CodePenal::class.java)
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