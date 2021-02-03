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

class Chap88CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap88_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 291 — Arrestation et séquestration.", "    (1) Est puni d'un emprisonnement de cinq à dix ans et d'une amende de 20.000 à 1 million de francs celui qui, de quelque manière que ce soit, prive autrui de sa liberté. \n" +
                "    (2) La peine est un emprisonnement de dix à vingt ans dans l'un des cas suivants : \n" +
                "        a) Si la privation de liberté dure plus d'un mois ; \n" +
                "        b) Si elle est accompagnée de sévices corporels ou moraux ; \n" +
                "        c) Si l'arrestation est effectuée soit au vu d'un faux ordre de l'autorité publique, soit avec port illégal d'uniforme, soit sous une fausse qualité."))
        chapter.add(Chapter("Article 292 — Travail forcé.", "Est puni d'un emprisonnement de un an à cinq ans et d'une amende de 10.000 à 500.000 francs ou de l'une de ces deux peines seulement celui qui, pour satisfaire son intérêt personnel, impose à autrui un travail ou un service pour lesquels il ne s'est pas offert de son plein gré."))
        chapter.add(Chapter("Article 293 — Esclavage.", "    (1) Est puni d'un emprisonnement de dix à vingt ans celui qui : \n" +
                "        a) Réduit ou maintient une personne en esclavage ; ou \n" +
                "        b) Se livre, même occasionnellement, au trafic d'une personne. \n" +
                "    (2) Est puni d'un emprisonnement de un à cinq ans et d'une amende de 10.000 à 1 million de francs celui qui donne ou reçoit en gage une personne. La juridiction peut en outre prononcer les déchéances de l'article 30 du présent Code. "))
        chapter.add(Chapter("Article 294 (nouveau).- — Proxénétisme.", "    (1) Est puni d'un emprisonnement de six mois à cinq ans et d'une amende de 20.000 à \n" +
                "1.000.000 de francs celui qui provoque, aide ou facilite la prostitution d'autrui ou qui partage même occasionnellement le produit de la prostitution d'autrui ou reçoit des subsides d'une personne se livrant à la prostitution. \n" +
                "    (2) Est présumé recevoir des subsides celui qui, vivant avec une personne se livrant à la prostitution, ne peut justifier de ressources suffisantes pour lui permettre de subvenir seul à sa propre existence. \n" +
                "    (3) Les peines sont doublées si : \n" +
                "        a) Le délit est accompagné de contrainte ou de fraude ou si l'auteur est armé ; ou s'il est le propriétaire, le gérant ou le préposé d'un établissement où se pratique la prostitution \n" +
                "        b) Si le délit a été commis au préjudice d'une personne mineure de vingt et un ans \n" +
                "        c) Si l'auteur est le père ou la mère, le tuteur ou le responsable coutumier. \n" +
                "    (4) Dans les cas susvisés à l'alinéa 3, les dispositions de l'article 48 sont obligatoirement appliquées. \n" +
                "    (5) La juridiction peut prononcer les déchéances de l'article 30 du présent Code et priver le condamné pendant la même durée de toute tutelle ou curatelle ; elle peut également lui interdire pendant la même durée la garde, même coutumière, de tout mineur de vingt et un ans. \n" +
                "    (6) La juridiction ordonne également, dans le cas prévu à l'alinéa 3, a) la fermeture de l'établissement, même s'il est affecté à tout autre usage. \n" +
                "    (7) Pour l'application du présent article, la prostituée n'est pas considérée comme complice. \n" +
                "Section II \n" +
                "DES OFFENSES SEXUELLES. \n" +
                "Article 295 — Outrage privé à la pudeur. \n" +
                "    (1) Est puni d'un emprisonnement de quinze jours à deux ans et d'une amende de 10.000 à 100.000 francs ou de l'une de ces deux peines seulement celui qui, même dans un lieu privé, commet un outrage à la pudeur en présence d'une personne de l'un ou l'autre sexe non consentante. \n" +
                "    (2) Les peines sont doublées si l'outrage est accompagné de violences. "))
        chapter.add(Chapter("Article 296 — Viol.", "Est puni d'un emprisonnement de cinq à dix ans celui qui à l'aide de violences physiques ou morales contraint une femme, même pubère, à avoir avec lui des relations sexuelles."))
        chapter.add(Chapter("Article 297 — Mariage subséquent.", "Le mariage, librement consenti, de la victime pubère lors des faits avec le coupable d'une infraction visée par les deux articles précédents produit les effets prévus à l'article 73, alinéas 1 à 4, du présent Code."))
        chapter.add(Chapter("Article 298 — Pénalités aggravées.", "Les peines des articles 294, 295 et 296 sont doublées lorsque le coupable est, soit : \n" +
                "        a) Une personne ayant autorité sur la victime ou en ayant la garde légale ou coutumière ; \n" +
                "        b) Un fonctionnaire ou un ministre du culte ; \n" +
                "        c) Une personne aidée par une ou plusieurs autres. "))

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
                val intent = Intent(this, Chap77CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Chap99CodePenal::class.java)
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