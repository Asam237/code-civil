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

class Chap3CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap3_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 7 — Infraction commise sur le territoire.", "    (1) La loi pénale de la République s'applique à tout fait commis sur son territoire. \n\n\n" +
                "(2) Sont compris dans le territoire de la République, les eaux territoriales et l'espace aérien au-dessus de ce territoire et de ses eaux ainsi que les navires et aéronefs immatriculés dans la République. \n\n\n" +
                "Toutefois, aucun membre de l'équipage d'un navire ou aéronef étranger, auteur d'une infraction commise à leur bord au préjudice d'un autre membre de l'équipage même à l'intérieur des eaux territoriales ou de l'espace aérien, ne peut être jugé par les juridictions de la République à moins que le secours de l'autorité locale n'ait été réclamé ou que l'ordre public n'ait été compromis. "))
        chapter.add(Chapter("Article 8 — Infraction partiellement ou totalement commise à l'étranger.", "La loi pénale de la République s'applique : \n" +
                "a) A toute infraction dont l'un des éléments constitutifs s'est trouvé réalisé sur son territoire ; \n" +
                "b) Aux infractions d'atteinte à la sûreté de l'Etat, de contrefaçon du sceau de l'Etat ou de monnaies nationales y ayant cours, commises même à l'étranger. \n\n\n" +
                "Toutefois, aucun étranger ne peut être jugé par les juridictions de la république en application de l'alinéa b, à moins qu'il n'ait été arrêté sur le territoire de la République ou qu'il n'ait été extradé.\n\n\n"))
        chapter.add(Chapter("Article 9 — Complicité, conspiration, tentative.", "Sont soumis à la loi pénale de la République : \n\n\n" +
                "a) Les faits constitutifs de complicité, de conspiration et de tentative réalisés sur le territoire de la République en vue de commettre une infraction à l'étranger si cette infraction est également réprimée par la loi étrangère ; \n\n\n" +
                "b) Les mêmes faits réalisés à l'étranger en vue de commettre une infraction sur le territoire de la république. "))
        chapter.add(Chapter("Article 10 — Infraction commise à l'étranger par le citoyen ou résident.", "    (1) La loi pénale de la république s'applique aux faits commis à l'étranger par un citoyen ou par un résident, à condition qu'ils soient punissables par la loi du lieu de leur commission et soient qualifiés crimes ou délits par les lois de la République. \n\n\n" +
                "Toutefois, la peine encourue ne peut être supérieure à celle prévue par la loi étrangère. \n\n\n" +
                "(2) Aucun citoyen ou résident coupable d'un délit commis contre un particulier ne peut toutefois être jugé par les juridictions de la République en application du présent article que sur la poursuite du ministère public saisi d'une plainte ou d'une dénonciation officielle au gouvernement de la République par le gouvernement du pays où le fait a été commis. "))
        chapter.add(Chapter("Article 11 — Infractions internationales.", "La loi pénale de la République s'applique à la piraterie, au trafic de personnes, à la traite des esclaves, au trafic des stupéfiants, commis même en dehors du territoire de la République. \n\n\n" +
                "Toutefois, aucun étranger ne peut être jugé sur le territoire de la République pour les faits visés au présent article, commis à l'étranger, que s'il a été arrêté sur le territoire de la République et n'a pas été extradé et à condition que la poursuite soit engagée par le ministère public."))
        chapter.add(Chapter("Article 12 — Compétence générale des juridictions de la République.", "Sous réserve des exceptions prévues au présent chapitre, les juridictions de la République sont compétentes pour connaître de toutes les infractions auxquelles s'applique sa loi pénale."))

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
                val intent = Intent(this, Chap2CodePenal::class.java)
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