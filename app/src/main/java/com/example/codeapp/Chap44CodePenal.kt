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

class Chap44CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap44_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 227 — Incendie et destruction.", "    (1) Est puni d'un emprisonnement de trois à dix ans et d'une amende de 5.000 à 1 million de francs celui qui, même s'il en est propriétaire, met le feu directement ou indirectement : \n" +
                "        a) A des lieux servant à l'habitation d'autrui ; \n" +
                "        b) A tout véhicule de terre, de mer ou de l'air contenant une ou plusieurs personnes ; \n" +
                "        c) Au mines ou à leurs dépendances lorsqu'elles sont exploitées. \n" +
                "    (2) La destruction accomplie dans les mêmes conditions est punie de la même peine. "))
        chapter.add(Chapter("Article 228 — Activités dangereuses.", "    (1) Est puni d'un emprisonnement de six jours à six mois celui qui ne prend pas les précautions nécessaires pour éviter à autrui des dommages corporels pouvant résulter de son activité dangereuse. \n" +
                "    (2) Est puni d'un emprisonnement de trois mois à trois ans et d'une amende de 5.000 à 500.000 francs ou de l'une de ces deux peines seulement celui qui par une imprudence grave risque de mettre autrui en danger : \n" +
                "        a) En se servant du feu, d'explosifs, de combustibles ou de moyens mécaniques ou électriques, ou ; \n" +
                "        b) En détruisant, même partiellement, des ouvrages ou édifices habités même s'il en est le propriétaire ; ou \n" +
                "        c) En donnant des soins médicaux ou chirurgicaux ou en fournissant ou en administrant des médicaments ou autres produits ; ou \n" +
                "        d) En conduisant, arrêtant ou abandonnant un véhicule ou un animal sur la voie publique. \n" +
                "    (3) Est puni des mêmes peines celui qui conduit un véhicule en état d'ivresse ou d'intoxication. \n" +
                "    (4) Dans les cas prévus à l'alinéa 2 (d) et à l'alinéa 3, la juridiction peut ordonner le retrait du permis de conduire ou l'interdiction de l'obtenir pour une durée maximum de deux ans."))
        chapter.add(Chapter("Article 229 — Substances explosives.", "Est puni d'un emprisonnement de un mois à un an et d'une amende de 2.000 à 100.000 francs ou de l'une de ces deux peines seulement celui qui enfreint la réglementation concernant la fabrication, la conservation, le transport, l'importation, l'exportation et le commerce des substances explosives."))
        chapter.add(Chapter("Article 230 — Voies publiques.", "    (1) Est puni d'un emprisonnement de un mois à deux ans celui qui sans autorisation régulière met obstacle à l'usage d'une voie publique terrestre ou d'une voie d'eau navigable ou qui en rend l'usage difficile en déformant la chaussée ou en détournant le cours de la voie d'eau soit par des constructions, soit par une utilisation abusive, soit par l'exploitation des terrains adjacents. \n" +
                "    (2) Est puni de la même peine celui qui étant chargé de l'entretien d'une voie publique ou d'un ouvrage s'y rapportant s'en abstient. "))
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
                val intent = Intent(this, Chap55CodePenal::class.java)
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