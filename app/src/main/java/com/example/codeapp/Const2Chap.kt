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

class Const2Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_const2_chap)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art. 14.", "(1) le pouvoir législatif est exercé par le Parlement qui comprend deux (2) chambres : • • l’Assemblée Nationale ; Le Sénat. \n" +
                "(2) le Parlement légifère et contrôle l’action du Gouvernement. \n" +
                "(3) Les chambres du parlement se réunissent aux mêmes dates : a- en sessions ordinaires, chaque année au mois de juin, au mois de novembre et au mois de mars sur convocation des bureaux de l’Assemblée Nationale et du Sénat, après consultation du Président de la République ; b- en sessions extraordinaires, à la demande du Président de la République ou du tiers des membres composant l’une et l’autre chambres. Toutefois, les deux chambres ne sont convoquées simultanément que si les matières portées à l’ordre du jour concernant l’une et l’autre.\n" +
                "(4) Les deux chambres du Parlement peuvent se réunir en congrès, à la demande du Président de la République : \n" +
                "• Pour entendre une communication ou recevoir un message du Président de la République ; \n" +
                "• Pour recevoir le serment des membres du Conseil Constitutionnel ; \n" +
                "• Pour se prononcer sur un projet ou une proposition de révision constitutionnelle. Lorsque le Parlement se réunit en congrès, le bureau de l’Assemblée Nationale préside les débats. \n" +
                "(5) Nul ne peut appartenir à la fois à l’Assemblée Nationale et au Sénat. \n" +
                "(6) La loi fixe le régime électorale de l’assemblée Nationale et du Sénat ainsi que le régime des immunités, des inéligibilités, des incompatibilités, des indemnités et des privilèges des membres du Parlement. Chapitre I De L’assemblée Nationale"))
        chapter.add(Chapter("Art. 15.", "(1) l’Assemblée Nationale est composée de cent quatre - vingt (180) députés élus au suffrage universel direct et secret pour un mandat de cinq (5) ans. Le nombre des députés élus à l’Assemblée Nationale peut - être modifié par la loi. \n" +
                "(2) Chaque député représente l’ensemble de la nation. \n" +
                "(3) Tout mandat impératif est nul. \n" +
                "(4) En cas de crise grave, le Président de la république peut, après consultation du président du Conseil constitutionnel et des bureaux de l’Assemblée Nationale et du Sénat, demander à l’Assemblée Nationale de décider par une loi de proroger ou d’abréger son mandat. Dans ce cas, l’élection d’une nouvelle Assemblée a lieu quarante (40) jours au moins et soixante (60) jours au plus après l’expiration du délai de prorogation ou d’abrègement de mandat. "))
        chapter.add(Chapter("Art. 16.", "(1) Au début de chaque législature, l’Assemblée Nationale se réunit de plein droit, en session ordinaires dans les conditions fixées par la loi. \n" +
                "(2) Chaque année, l’Assemblée Nationale tient trois (3) sessions ordinaires d’une durée maximum de trente (30) jours chacune. \n" +
                "a- A l’ouverture de sa première session ordinaire, l’Assemblée nationale élit son Président et son bureau. \n" +
                "b- Au cours de l’une des sessions, l’Assemblée nationale vote le budget de l’État. Au cas où le budget n’aurait pas été adopté avant la fin de l’année budgétaire en cours, Le Président de la République est habilité à reconduire, par douzième, le budget de l’exercice précédent jusqu'à l’adoption du nouveau budget. \n" +
                "(3) L’Assemblée Nationale se réunit en session extraordinaire pour une durée maximum de quinze (15) jours, sur un ordre du jour déterminé, à la demande sur Président de la République au d’un tiers des députés. La session extraordinaire est close dès épuisement de l’ordre du jour. "))
        chapter.add(Chapter("Art. 17.", "1) Les séances de l’Assemblée Nationale sont publiques. A la demande du Gouvernement ou de la majorité absolue de ses membres, l’Assemblée Nationale peut, exceptionnellement, se réunir à huis clos. \n" +
                "(2) L’Assemblée Nationale fixe, elle même, ses règles d’organisation et de fonctionnement sous forme de loi portant règlement intérieur. "))
        chapter.add(Chapter("Art. 18.", "(1) L’ordre du jour de l’Assemblée Nationale est fixé par la conférence des présidents. \n" +
                "(2) La conférence des présidents comprend : les présidents des groupes parlementaires, les présidents des commissions et les membres du bureau de l’Assemblée Nationale. Un membre du Gouvernement participe aux travaux de la conférence des présidents. \n" +
                "(3) Seuls les textes relevant de sa compétence en vertu de l’article 26 ci - dessous peuvent être inscrits à l’ordre du jour de l’Assemblée Nationale. \n" +
                "a- Sont irrecevables, les propositions de loi ou amendements, qui auraient pour effet, s’ils sont adoptés, soit un diminution des ressources publiques, soit l’aggravation des charges publiques sans réduction à due concurrence d’autres dépenses ou création de recettes nouvelles d’égale importance. \n" +
                "b- En cas de doute ou de litige sur la recevabilité d’un texte, le Président de la République, le Président de l’Assemblée Nationale ou un tiers des députés saisit le Conseil Constitutionnel qui en décide. \n" +
                "(4) l’ordre du jour comporte en priorité et dans l’ordre que le Gouvernement a fixé, la discussion des projets de loi ou des propositions de loi qu’il a acceptées. Les autres propositions de loi retenues par la conférence des présidents sont examinées par la suite. Lorsque, à l’issue de deux sessions ordinaires, une proposition de loi n’a pu être examinée, celle - ci est de plein droit examiné au cours de la session ordinaire suivante. \n" +
                "(5) L’urgence est de droit lorsqu’elle est demandée par le Gouvernement. "))
        chapter.add(Chapter("Art. 19.", "(1) L’Assemblée Nationale adopte les lois à la majorité simple des députés. \n" +
                "(2) l’Assemblée nationale adopte ou rejette les textes soumis à son réexamen par le Sénat, conformément aux dispositions de l’articles 30 ci - dessous. \n" +
                "(3) Avant leur promulgation, les lois peuvent faire l’objet d’une demande de seconde lecture par le Président de la République. Dans ce cas, ces lois sont adoptées à la majorité absolue des députés. Chapitre II Du Sénat "))
        chapter.add(Chapter("Art. 20.", "(1) Le Sénat représente les collectivités territoriales décentralisées. \n" +
                "(2) Chaque région est représentée au Sénat par dix (10) sénateurs dont sept (7) sont élus au suffrage universel indirect sur la base régionale et trois (3) nommés par le Président de la République. \n" +
                "(3) les candidats à la fonction de sénateur ainsi que les personnalités nommées à ladite fonction par le Président de la République, doivent avoir quarante (40) ans révolus à la date de l’élection ou de la nomination. (4) La durée du mandat des sénateurs est de cinq (5) ans. "))
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
                val intent = Intent(this, Const1Chap::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Const3Chap::class.java)
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