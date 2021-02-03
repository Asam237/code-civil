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

class Tra2Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tra2_chap)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art.3.", " La loi reconnaît aux travailleurs et aux employeurs, sans restriction d’aucune sorte et sans\n" +
                "autorisation préalable, le droit de créer librement des syndicats professionnels ayant pour objet\n" +
                "l’étude, la défense, le développement et la protection de leurs intérêts notamment économiques,\n" +
                "industriels, commerciaux et agricoles, ainsi que le progrès social, économique, culturel et moral de\n" +
                "leurs membres. Toute activité qui n’est pas de nature à promouvoir ces objectifs demeure interdite\n" +
                "aux syndicats professionnels."))
        chapter.add(Chapter("Art.4.", "1) Les travailleurs et les employeurs ont le droit de s’affilier à un syndicat de leur choix dans le\n" +
                "cadre de leur profession ou de leur branche d’activité. 2) Sont interdits à l’égard des travailleurs :\n" +
                "• a) tout acte de discrimination tendant à porter atteinte à la liberté syndicale en matière d’emploi ;\n" +
                "• b) toute pratique tendant à : - subordonner leur emploi à leur affiliation ou à leur non-affiliation à\n" +
                "un syndicat ; - les licencier ou leur causer un préjudice quelconque en raison de leur affiliation ou de\n" +
                "leur non-affiliation à un syndicat ou de leur participation à des activités syndicales.\n" +
                "3) Est nul et de nul effet tout acte contraire aux dispositions du présent article."))
        chapter.add(Chapter("Art.5.", "1) Les organisations de travailleurs et d’employeurs ont le droit d’élaborer leurs statuts et\n" +
                "règlements administratifs, d’élire librement leurs représentants et d’organiser leur gestion, à\n" +
                "condition de se conformer à la législation et à la réglementation en vigueur.\n" +
                "2) Sont interdits tous actes d’ingérence de ces organisations les unes à l’égard des autres."))
        chapter.add(Chapter("Art.6.", "1) Un syndicat professionnel n’a d’existence légale qu’à partir du jour où un certificat\n" +
                "d’enregistrement lui est délivré par le greffier des syndicats.\n" +
                "2) Les promoteurs d’un syndicat non encore enregistré qui se comporteraient comme si ledit\n" +
                "syndicat avait été enregistré sont passibles de poursuites judiciaires.\n" +
                "3) Le greffier des syndicats est un fonctionnaire nommé par décret."))
        chapter.add(Chapter("Art.7.", "1) Nul ne peut être membre d’un syndicat de travailleurs s’il n’exerce effectivement une\n" +
                "profession salariée au moment de son adhésion.\n" +
                "2) Toutefois, peuvent continuer à faire partie d’un syndicat professionnel, les personnes qui ont\n" +
                "quitté l’exercice de leurs fonctions ou de leurs professions, à la double condition :\n" +
                "• a) d’avoir exercé celle-ci pendant au moins six mois ;\n" +
                "• b) de se consacrer à des fonctions syndicales ou d’être appelées, à titre professionnel, à des\n" +
                "fonctions prévues par les lois et les règlements."))
        chapter.add(Chapter("Art.8.", "Toute demande d’enregistrement doit porter la signature de vingt personnes au moins dans le\n" +
                "cas d’un syndicat de travailleurs ou de cinq personnes au moins dans le cas d’un syndicat\n" +
                "d’employeurs. Les statuts du syndicat doivent se conformer aux dispositions de la présente loi."))
        chapter.add(Chapter("Art.9.", "La forme dans laquelle doivent être constitués les syndicats pour être admis à la procédure\n" +
                "d’enregistrement est fixée par décret pris après avis de la Commission nationale consultative du travail."))
        chapter.add(Chapter("Art.10.", "1) Les promoteurs d’un syndicat ainsi que les membres chargés de son administration ou de\n" +
                "la direction doivent jouir de leurs droits civiques et ne pas avoir encouru de condamnation\n" +
                "emportant les déchéances prévues à l’article 30 alinéas 1, 2 et 3 du Code Pénal.\n" +
                "2) Les étrangers doivent, en outre, avoir résidé pendant cinq ans au moins sur le territoire de la République du Cameroun"))
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
                val intent = Intent(this, Tra1Chap::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Tra3Chap::class.java)
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