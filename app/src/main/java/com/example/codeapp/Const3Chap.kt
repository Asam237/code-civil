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

class Const3Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_const3_chap)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art. 25.", "l’initiative des lois appartient concurremment au président de la République et aux membres du parlement. "))
        chapter.add(Chapter("Art. 26.", "(1) la loi est votée par le Parlement. Sont du domaine de la loi : \n" +
                "a- Les droits, garanties et obligations fondamentaux du citoyen : \n" +
                "1. La sauvegarde de la liberté et de la sécurité individuelles ; \n" +
                "2. Le régime des libertés publiques ; \n" +
                "3. Le droit du travail, le droit syndical, le régime de la protection sociale ; \n" +
                "4. Les devoirs et obligations du citoyen en fonction des impératifs de la défense nationale. \n" +
                "b- Le statut des personnes et le régime de biens : \n" +
                "1. la nationalité, l’état et la capacité des personnes, les régimes matrimoniaux, les successions et libéralités ; \n" +
                "2. le régime des obligations civiles et commerciales ; \n" +
                "3. le régime de la propriété mobilière et immobilière. \n" +
                "c- L’organisation politique, administrative et judiciaire concernant : \n" +
                "1. le régime de l’élection à la Présidence de la République, le régime des élections à l’Assemblée Nationale, au Sénat et aux Assemblées Régionales et locales et le régime des consultations référendaires ; \n" +
                "2. le régime des associations et des parties politiques ; \n" +
                "3. l’organisation, le fonctionnement, la détermination des compétences et des ressources des collectivités territoriales décentralisées ; \n" +
                "4. les règles générales d’organisation de la défense nationale ; \n" +
                "5. l’organisation judiciaire et la création des ordres de juridiction ; \n" +
                "6. la détermination des crimes et délits et l’institution des peines de toute nature, la procédure pénale, la procédure civile, les voies d’exécution, l’amnistie. \n" +
                "d- Les questions financières et patrimoniales suivantes : \n" +
                "1. le régime d’émission de la monnaie ; \n" +
                "2. le budget ; \n" +
                "3. la création des impôts et taxes et la détermination de l’assiette, du taux et des modalités de recouvrement de ceux - ci ; \n" +
                "4. Le régime domanial, foncier et minier ; \n" +
                "5. Le régime des ressources naturelles. \n" +
                "e- La programmation des objectifs de l’action économique et sociale. f- Le régime de l’éducation. "))
        chapter.add(Chapter("Art. 27.", "Les matières autres que celles qui sont du domaine de la loi ressortissent au pouvoir réglementaire. "))
        chapter.add(Chapter("Art. 28.", "Dans les matières énumérées à l’article 26 alinéa 2 ci - dessus, le parlement, peut autoriser le Président de la République, pendant un délai limité et sur des objets déterminés, à prendre des ordonnances. Ces ordonnances entrent en vigueur dès leur publication. Elles sont déposées sur le bureau de l’Assemblée nationale et sur celui du Sénat aux fins de ratification dans le délai fixé par la loi d’habitation. Elles ont un caractère réglementaire tant qu’elles n’ont pas été ratifiées. Elles demeurent en vigueur tant que le Parlement n’a pas refusé de les ratifier. "))
        chapter.add(Chapter("Art. 29.", "(1) Les projets et propositions de loi sont déposés à la fois sur le bureau de l’Assemblée Nationale et sur celui du Sénat. Ils sont examinés par les commissions compétentes avant leur discussion en séance plénière. \n" +
                "(2) Le projet de loi examiné en séance plénière est le texte déposé par le Président de la République. La proposition de loi examinée en séance plénière est le texte élaboré par l’auteur ou les auteurs de celle - ci. \n" +
                "(3) Ces textes peuvent faire l’objet d’amendements lors de leur discussion. "))
        chapter.add(Chapter("Art. 30.", "(1) les textes adoptés par l’Assemblée Nationale sont aussitôt transmis au président du Sénat par le Président de l’Assemblée Nationale. \n" +
                "(2) Le Président du Sénat, dès réception des textes transmis par le président de l’Assemblée Nationale, les soumet à la délibération du Sénat. \n" +
                "(3) le Sénat, dans un délai de dix (10) jours à partir de la réception des textes ou dans un délai de cinq (5) jours pour les textes dont le Gouvernement déclare l’urgence, peut : \n" +
                "a- Adopter le texte. Dans ce cas, le Président du Sénat retourne le texte adopté au président de l’Assemblée Nationale qui le transmet dans les quarante - huit (48) heures au président de la République aux fins de promulgation. \n" +
                "b- Apporter des amendements au texte. Les amendements, pour être retenus, doivent être approuvés à la majorité simple des sénateurs. Dans ce cas, le texte amendé est retourné à l’Assemblée Nationale par le Président du Sénat pour un nouvel examen. Les amendements proposés par le Sénat sont adoptés ou rejetés à la majorité simple des députés. Le texte adopté définitivement est transmis par le président de l’Assemblée Nationale au Président de la République pour promulgation. \n" +
                "c- Rejeter tout ou partie du texte. Le rejet doit être approuvé à la majorité absolue des sénateurs. Dans ce cas, le texte en cause, accompagné de l’exposé des motifs du rejet, est retourné par le Président du Sénat à l’Assemblée Nationale, pour un nouvel examen. \n" +
                "    1- L’Assemblée Nationale, après délibération, adopte le texte à la majorité absolue des députés. Le texte adopté définitivement par l’Assemblée Nationale est transmis au Président de la République pour promulgation. \n" +
                "    2- En cas d’absence de majorité absolue, le président de la République peut provoquer la réunion d’une commission mixte paritaire chargée de proposer un texte commun sur les dispositions rejetées par le Sénat. Le texte élaboré par la commission mixte paritaire est soumis par le Président de la République pour approbation aux deux chambres. Aucun amendement n’est recevable, sauf accord du Président de la République. Si la commission mixte paritaire ne parvient pas à l’adoption d’un texte commun, ou ce texte n’est pas adopté par l’une et l’autre chambres, le Président de la République peut : \n" +
                "• soit demander à l’Assemblée Nationale de statuer définitivement ; \n" +
                "• soit déclarer caduc le projet ou la proposition de loi. "))
        chapter.add(Chapter("Art. 31.", " (1) Le Président de la République promulgue les lois adoptées par le Parlement dans un délai de quinze (15) jours à compter de leur transmission, s’il ne formule aucune demande de seconde lecture ou s’il n’en saisit le Conseil Constitutionnel. \n" +
                "(2) A l’issue de ce délai, et après avoir constaté sa carence, le Président de l’Assemblée nationale peut se substituer au Présidente la République. \n" +
                "(3) La publication de lois est effectuée au journal officiel de la République en français et en anglais. "))
        chapter.add(Chapter("Art. 32.", "Le Président de la République peut, sur sa demande, être entendu par l’Assemblée Nationale, le Sénat, ou les deux chambres réunies en congrès. Il peut également leur adresser des messages. Ces communications ne donnent lieu à aucun débat en sa présence"))
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
                val intent = Intent(this, Const2Chap::class.java)
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