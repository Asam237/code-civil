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

class Chap4444CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap4444_code_penal)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 188 —", "La Cour d'Appel connaît de l'appel de tous les jugements en premier ressort par les tribunaux de première instance et les justices de paix à compétence étendue. \n" +
                "Les tribunaux de première instance et les justices de paix à compétence étendue connaissent de l'appel de tous les jugements rendus en premier ressort par les justices de paix à compétence ordinaire. \n" +
                "[Voir D. 247 du 18-12-59 sur les dispositions transitoires de l'organisation judiciaire et l dévolution de l'appel (J.O.C., 59, p. 1814)] "))
        chapter.add(Chapter("Article 189 —", "(Art. 36 du D. du 27 novembre 1947).- L'appel sera formé par simple requête aux membres de la juridiction d'appel."))
        chapter.add(Chapter("Article 190 —", "La requête d'appel contiendra les énonciations de la requête introductive d'instance ordinaire, les motifs de l'appel et les conclusions de l'appelant. \n" +
                "Une expédition du jugement frappé d'appel y sera annexée. "))
        chapter.add(Chapter("Article 191 —", "La requête d'appel signée de la partie ou de son mandataire sera déposée au greffe de la juridiction d'appel en autant d'exemplaires qu'il y a de parties intimées. Elle pourra y être adressée par la poste, sous pli recommandé. \n" +
                "(Décret n° 68/df/441 du 8 novembre 1968).- \n" +
                "Aussitôt qu'elle aura été reçue, le greffier fera notifier à la partie appelante le montant de la consignation à verser ; cette consignation doit, à peine de déchéance d'ordre public de l'appel, intervenir dans un délai de quatre mois à compter de la notification. Ce délai est interrompu par le dépôt d'une requête en assistance judiciaire. \n" +
                "Si la partie appelante ne consigne pas et ne justifie pas qu'elle bénéficie de l'assistance judiciaire, la déchéance encourue est constatée, le cas échéant d'office par ordonnance sans frais du président de la cour d'appel. Cette ordonnance notifiée aux parties est susceptible de pourvoi en cassation dans le délai de droit commun à compter de la date de sa notification. Cette notification est faite par voie administrative ou par exploit d'huissier et dans ce dernier cas à la diligence de l'intimé. \n" +
                "La partie appelante peut en outre être condamnée à une amende civile de 5 à 20 000 francs en cas d'appel dilatoire. \n" +
                "Si la consignation est versée ou s'il est justifié du bénéfice de l'assistance judiciaire la requête sera enregistrée. » \n" +
                "--------------------------------------------------- \n" +
                "[Ancienne forme du second alinéa :  Aussitôt qu'elle aura été reçue, elle sera enregistrée au greffe par le greffier sur un registre à ce destiné. \n" +
                "Après son enregistrement, le Président de la juridiction d'appel rendra une ordonnance donnant acte de la requête reçue et fixant à l'intimé un délai pour produire ses défenses et la date de l'audience. Avis de la requête et de l'ordonnance rendue sera donné par le greffier de la juridiction à la partie intimée ou à son représentant. Avis sera également donné à la partie appelante de l'ordonnance. Un récépissé sera retiré par le greffier. \n" +
                "Dans le cas où l'avis destiné à l'intimé sera retourné au greffe avec mention de sa non remise, le greffier en avertira l'appelant. Celui-ci fera alors signifier son appel comme il est dit à la section \" Les assignations \" en observant pour l'assignation à comparaître devant la juridiction d'appel les délais portés aux articles 13 et 14 du présent arrêté. \n" +
                "] "))
        chapter.add(Chapter("Article 192 — ", "(Art. 36 du décret du 27 novembre 1947).- Le délai pour interjeter appel sera de trois mois augmenté des délais de distance des articles 14 et 15, sauf dans les matières où un texte spécial en aura disposé autrement. "))
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
                val intent = Intent(this, Chap5555CodePenal::class.java)
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