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

class Tra1Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tra1_chap)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art.1.", "1) La présente loi régit les rapports de travail entre les travailleurs et les employeurs ainsi\n" +
                "qu’entre ces derniers et les apprentis placés sous leur autorité.\n" +
                "2) Est considéré comme « travailleur » au sens de la présente loi, quels que soient son sexe et sa\n" +
                "nationalité, toute personne qui s’est engagée à mettre son activité professionnelle moyennant\n" +
                "rémunération, sous la direction et l’autorité d’une personne physique ou morale, publique ou privée,\n" +
                "celle-ci étant considérée comme « employeur ». Pour la détermination de la qualité de travailleur, il\n" +
                "ne doit être tenu compte ni du statut juridique de l’employeur, ni de celui de l’employé.\n" +
                "3) Sont exclus du champ d’application de la présente loi les personnels régis par :\n" +
                "• le statut général de la fonction publique ;\n" +
                "• le statut de la magistrature ;\n" +
                "• le statut général des militaires ;\n" +
                "• le statut spécial de la sûreté nationale ;\n" +
                "• le statut spécial de l’administration pénitentiaire ;"))
        chapter.add(Chapter("Art.2.", "1) Le droit au travail est reconnu à chaque citoyen comme un droit fondamental. L’Etat doit\n" +
                "tout mettre en oeuvre pour l’aider à trouver un emploi et à le conserver lorsqu’il l’a obtenu.\n" +
                "2) Le travail est un droit national pour tout citoyen adulte et valide.\n" +
                "3) Le travail forcé ou obligatoire est interdit.\n" +
                "4) On entend par travail forcé ou obligatoire tout travail ou service, exigé d’un individu sous la\n" +
                "menace d’une peine quelconque et pour lequel ledit individu ne s’est pas offert de son plein gré.\n" +
                "5) Toutefois, le terme « travail forcé ou obligatoire » ne comprend pas :\n" +
                "• a) tout travail ou service exigé en vertu des lois et règlements sur le service militaire et affecté à\n" +
                "des travaux de caractère purement militaire ;\n" +
                "• b) tout travail ou service d’intérêt général faisant partie des obligations civiques des citoyens, telles\n" +
                "qu’elles sont définies par les lois et les règlements ;\n" +
                "• c) tout travail ou service exigé d’un individu comme conséquence d’une condamnation prononcée\n" +
                "par une décision judiciaire ;\n" +
                "• d) tout travail ou service exigé dans les cas de force majeure, notamment dans les cas de guerre, de\n" +
                "sinistres ou menaces de sinistres tels qu’incendies, inondations, épidémies et épizooties violentes,\n" +
                "invasions d’animaux, d’insectes ou de parasites végétaux nuisibles et, en général, toutes\n" +
                "circonstances mettant en danger ou risquant de mettre en danger la vie ou les conditions normales\n" +
                "d’existence de l’ensemble ou d’une partie de la population."))
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
                val intent = Intent(this, Tra2Chap::class.java)
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