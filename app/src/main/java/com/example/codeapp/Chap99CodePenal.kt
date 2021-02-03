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

class Chap99CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap99_code_penal)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 309 — Abus de blanc-seing.", "Est puni d'un emprisonnement de un à cinq ans et d'une amende de 5.000 à 500.000 francs ou de l'une de ces deux peines seulement celui qui abuse d'un blanc-seing qui lui est confié pour y écrire frauduleusement soit une obligation, disposition ou décharge, soit une mention susceptible de compromettre la personne ou la fortune du signataire. "))
        chapter.add(Chapter("Article 310 — Secret professionnel.", "    (1) Est puni d'un emprisonnement de trois mois à trois ans et d'une amende de 20.000 à 100.000 francs celui qui révèle sans l'autorisation de celui à qui il appartient un fait confidentiel qu'il n'a connu ou qui ne lui a été confié qu'en raison de sa profession ou de sa fonction. \n" +
                "    (2) L'alinéa précédent ne s'applique ni aux déclarations faites aux autorités judiciaires ou de police judiciaire portant sur des faits susceptibles de constituer un crime ou un délit, ni aux réponses en justice à quelque demande que ce soit. \n" +
                "    (3) L'alinéa 2 ne s'applique pas : \n" +
                "        a) Au médecin et au chirurgien qui sont toujours tenus au secret professionnel, sauf dans la limite d'une réquisition légale ou d'une commission d'expertise ; \n" +
                "        b) Au fonctionnaire sur l'ordre écrit du Gouvernement ; \n" +
                "        c) Au ministre du culte et à l'avocat. \n" +
                "    (4) La juridiction peut prononcer les déchéances de l'article 30 du présent Code. "))
        chapter.add(Chapter("Article 311 — Violation du secret commercial. ", "    (1) Est puni d'un emprisonnement de trois mois à trois ans et d'une amende de 100.000 à 5 millions de francs ou de l'une de ces deux peines seulement, celui qui révèle sans l'autorisation de celui auquel il appartient un fait ou procédé industriels ou commerciaux dont il a eu connaissance en raison de son emploi. \n" +
                "    (2) La juridiction peut prononcer les déchéances de l'article 30 du présent Code. "))
        chapter.add(Chapter("Article 312 — Corruption de l'employé. ", "Est puni d'un emprisonnement de un à trois ans et d'une amende de 50.000 à 500.000 francs ou de l'une de ces deux peines seulement tout employé rémunéré sous quelque forme que ce soit qui, sans l'autorisation de son patron, reçoit des dons ou agrée des promesses pour faire ou s'abstenir de faire un acte de son service. "))
        chapter.add(Chapter("Article 313 — Tromperie envers des associés.", "    (1) Est puni d'un emprisonnement de un à cinq ans et d'une amende de 50.000 à 1 million de francs tout directeur, gérant, administrateur ou contrôleur des comptes d'une société qui, dans le but d'induire en erreur un ou plusieurs associés, actionnaires ou créanciers, fait une fausse déclaration ou fournit un compte faux. \n" +
                "    (2) La juridiction peut en outre prononcer les déchéances de l'article 30 du présent Code."))
        chapter.add(Chapter("Article 314 — Faux en écriture privée ou de commerce.", "        chapter.add(Chapter(\"Article 314 — Faux en écriture privée ou de commerce.\", \"\"))\n"))
        chapter.add(Chapter("Article 315 — Contrefaçon de certificat.", "    (1) Est puni d'un emprisonnement de un mois à un an celui qui contrefait ou falsifie un certificat privé ou qui émet un certificat faux non autrement puni ou qui fait usage d'un certificat privé contrefait, falsifié ou faux. \n" +
                "    (2) La peine est doublée en cas de contrefaçon, fabrication ou usage d'un certificat médical ou d'une écriture privée non prévue par l'article 314."))

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
                val intent = Intent(this, Chap88CodePenal::class.java)
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