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

class Chap111CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap111_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 2 — En matière civile et commerciale", "Les parties pourront, devant toutes les juridictions, agir et se défendre elles-mêmes, verbalement ou par le ministère des avocats-défenseurs. Lorsque le nombre des avocats-défenseurs au siège du tribunal ou de la justice de Paix à compétence étendue sera moindre de deux pour une cause quelconque ou lorsque le nombre des avocats-défenseurs du siège est insuffisant, les parties pourront se faire représenter devant cette juridiction par un mandataire de leur choix, muni d'un pouvoir écrit et exprès et agréé par le juge. Les parties pourront également recourir à la procédure sur requêtes et mémoires prévue par les articles 19 et suivants. "))
        chapter.add(Chapter("Article 3 — Toutes les instances sont dispensées du préliminaire de conciliation.", "Néanmoins, dans toutes les affaires, les parties peuvent, d'accord, comparaître volontairement aux fins de conciliation devant le Juge compétent. Le demandeur a également la faculté de citer le défendeur en conciliation en observant les délais portés aux articles 14 et 15. \n" +
                "Le Juge saisi peut, en tout état de la procédure, tenter la conciliation des parties qui pourront être assistées de leurs avocats. "))
        chapter.add(Chapter("Article 4 —", "S'il y a conciliation le Juge, assisté du Greffier, dresse procès-verbal des conditions de l'arrangement. Ce procès-verbal est signé par les deux parties si elles le savent et le peuvent, sinon mention en est faite. Il fait preuve jusqu'à inscription de faux vis-à-vis de tous et de sa date et des déclarations qui y sont relatées ; les conventions des parties inscrites au procès-verbal ont force exécutoire et comportent hypothèque judiciaire. Ce procès-verbal est déposé au greffe. "))
        chapter.add(Chapter("Article 5 — ", " Sous réserve de ce qui sera dit aux articles 18 et suivants, les instances en matière civile et commerciale sont introduites par assignations. "))
        chapter.add(Chapter("Article 6 — L'assignation contiendra", "1°  La date des jours, mois et an, les nom, profession et domicile du demandeur ; \n" +
                "2°  Les nom, demeure et matricule de l'huissier ou de l'agent d'exécution, les nom et demeure du défendeur, et mention de la personne à laquelle copie de l'exploit sera laissée ; \n" +
                "3°  L'objet de la demande, l'exposé sommaire des moyens ; \n" +
                "4°  L'indication du tribunal qui doit connaître de la demande, la date et l'heure de l'audience. "))

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
                val intent = Intent(this, Chap2222CodePenal::class.java)
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