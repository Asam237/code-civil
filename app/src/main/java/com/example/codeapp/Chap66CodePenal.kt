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

class Chap66CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap66_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 252 — Faux poids et mesures.", "Est puni d'un emprisonnement de quinze jours à six mois et d'une amende de 10.000 à \n" +
                "700.000 francs ou de l'une de ces deux peines seulement le commerçant ou l'artisan qui \n" +
                "détient au lieu de son commerce ou de son travail des poids ou mesures faux ou autres appareils inexacts servant au pesage ou au mesurage de ses marchandises."))
        chapter.add(Chapter("Article 253 — (Loi n° 90-061 du 19 décembre 1990) Chèque sans provision.", "(1) Est puni des peines prévues à l'article 318 celui qui : \n" +
                "    a) Emet un chèque sur une banque ou un compte postal même étrangers, sans provision préalable et disponible ou sans provision suffisante ; \n" +
                "    b) Après émission, même à l'étranger, retire tout ou partie de la provision ou fait défense au tiré de payer."))
        chapter.add(Chapter("Article 254 — Liberté des enchères.", "Est puni d'un emprisonnement de un à six mois et d'une amende de 50.000 à 1 million de francs celui qui par violences ou menaces, par dons ou promesses ou par quelque manœuvre trouble la liberté ou entrave la sincérité des enchères ou soumissions."))
        chapter.add(Chapter("Article 255 — Entraves à la liberté du travail.", "Est puni d'un emprisonnement de quinze jours à trois ans et d'une amende de 5.000 à 700.000 francs ou de l'une de ces deux peines seulement celui qui à l'aide de violences, menaces ou manœuvres frauduleuses amène ou maintient une cessation concertée du travail pour forcer la hausse ou la baisse des salaires ou pour porter atteinte au libre exercice du travail ou de l'industrie."))
        chapter.add(Chapter("Article 256 — Pression sur les prix.", "    (1) Est puni d'un emprisonnement de deux mois à deux ans et d'une amende de 400.000 à 20 millions de francs celui qui par des moyens frauduleux quelconques opère la hausse ou la baisse artificielles du prix des marchandises ou des effets publics ou privés. \n" +
                "    (2) La peine est doublée au cas où les marchandises sont des denrées alimentaires ou sont visées par les textes relatifs au conditionnement. \n" +
                "    (3) La juridiction peut en outre prononcer les déchéances de l'article 30 (1) et (2) et ordonner la publication de sa décision."))
        chapter.add(Chapter("Article 257 — Destruction de denrées.", "Est puni d'un emprisonnement de un à cinq ans et d'une amende de 50.000 à 1 million de francs celui qui dans le but d'agir sur les cours des denrées alimentaires destinés à l'homme ou aux animaux les fait ou laisse périr, corrompre ou disparaître. \n"))

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
                val intent = Intent(this, Chap55CodePenal::class.java)
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