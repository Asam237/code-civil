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

class Chap6CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap6_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 30 — Définition.", "Les déchéances consistent : \n" +
                "1°  Dans la destitution et l'exclusion de toutes fonctions, emplois ou offices publics ; \n" +
                "2°  Dans l'incapacité d'être juré, assesseur, expert, juré-expert ; \n" +
                "3°  Dans l'interdiction d'être tuteur, curateur, subrogé tuteur ou conseil judiciaire, si ce n'est de ses propres enfants, ou membre d'un conseil de famille ; \n" +
                "4°  Dans l'interdiction de porter toute décoration ; \n" +
                "5°  Dans l'interdiction de servir dans les forces armées ; \n" +
                "6°  Dans l'interdiction de tenir une école ou même d'enseigner dans un établissement d'instruction et, d'une façon générale, d'occuper des fonctions se rapportant à l'éducation ou à la garde des enfants."))
        chapter.add(Chapter("Article 31 — Application.", "    (1) La condamnation à une peine perpétuelle emporte à vie les déchéances prévues à l'article précédent. \n" +
                "    (2) Toute autre condamnation pour crime emporte les mêmes déchéances pendant la durée de la peine et pendant les dix ans qui suivent son expiration ou la libération conditionnelle si celle-ci n'a pas été révoquée. \n" +
                "    (3) La cour peut, dans tous les cas prévus à l'alinéa précédent, par décision motivée, relever le condamné de tout ou partie de ces échéances et en réduire la durée jusqu'à deux ans. \n" +
                "    (4) En cas de condamnation pour délit et lorsque la loi les y autorise, les tribunaux peuvent, par décision motivée, prononcer pour une durée de cinq ans au plus tout ou partie des déchéances prévues à l'article précédent."))
        chapter.add(Chapter("Article 32 — Déchéances et contumace.", "En cas de condamnation par contumace, les déchéances sont encourues du jour de l'accomplissement des mesures de publicité prévues au code de procédure pénale."))
        chapter.add(Chapter("Article 33 — (L. 93-013 du 22 décembre 1993) Publication du jugement.", "    (1) Dans les cas où le Tribunal ou la Cour peut ordonner la publication de sa décision, celle-ci est affichée dans les conditions qui sont fixées par décret pour une durée de deux mois au maximum en cas de condamnation pour crime ou délit et de quinze jours au maximum en cas de contravention. \n" +
                "    (2) Dans les mêmes cas, le Tribunal ou la Cour peut également ordonner la publication de sa décision dans les journaux qu'il indique, à la radio ou à la télévision. \n" +
                "    (3) Ces publications sont faites aux frais du condamné. \n" +
                "    (4) L'information par presse écrite, par radio et par télévision ainsi que les commentaires objectifs sont libres."))
        chapter.add(Chapter("Article 35 — Confiscation du << corpus delicti >>.", "Dans les cas où le Tribunal ou la Cour peut ordonner la fermeture d'un établissement commercial ou industriel ou d'un local professionnel ayant servi à commettre une infraction, cette mesure emporte l'interdiction pour le condamné ou pour le tiers auquel le condamné a vendu, cédé ou loué l'établissement ou le local professionnel d'exercer dans le même local le même commerce, la même industrie ou la même profession. "))
        chapter.add(Chapter("Article 34 — Fermeture de l'établissement.", "    (1) En cas de condamnation pour crime ou délit, le tribunal ou la cour peut ordonner la confiscation de tous biens meubles ou immeubles appartenant au condamné et saisis, lorsque ceux-ci ont servi d'instrument pour commettre l'infraction ou qu'ils en sont le produit. \n" +
                "    (2) En matière de contravention, cette confiscation ne peut être ordonnée que dans les cas déterminés par la loi. "))

        var adapter = CustomAdapter(chapter)

        rv.adapter = adapter

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_pan_chap_three, menu)
        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.chaptr1 -> {
//                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Chap4CodePenal::class.java)
                startActivity(intent)
            }
            R.id.home -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)

            }
//            R.id.chaptr2 -> {
////                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
//                val intent = Intent(this, Chap5CodePenal::class.java)
//                startActivity(intent)
//            }
        }

        return super.onOptionsItemSelected(item)
    }
}