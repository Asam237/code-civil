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

class Chap8CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap8_code_penal)

            val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
            rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
            val chapter = ArrayList<Chapter>()
            chapter.add(Chapter("Article 77 — Cas fortuit et contrainte matérielle.", "La responsabilité pénale ne peut résulter ni du cas fortuit, ni de la contrainte matérielle irrésistible."))
            chapter.add(Chapter("Article 78 — Démence.", "(1) La responsabilité pénale ne peut résulter du fait d'un individu atteint d'une maladie mentale telle que sa volonté a été abolie ou qu'il n'a pu avoir conscience du caractère répréhensible de son acte. \n" +
                    "(2) Au cas où la démence n'est pas totale, elle constitue une excuse atténuante."))
            chapter.add(Chapter("Article 79 — Intoxication.", "L'intoxication qui n'est pas volontaire est assimilée à la maladie mentale."))
        chapter.add(Chapter("Article 80 — La minorité.", "    (1) Le mineur de dix ans n'est pas pénalement responsable. \n" +
                "    (2) Le mineur de dix à quatorze ans pénalement responsable ne peut faite l'objet que de l'une des mesures spéciales prévues à la loi. \n" +
                "    (3) Le mineur âgé de plus de quatorze ans et de moins de dix-huit ans pénalement responsable bénéficie de l'excuse atténuante. \n" +
                "    (4) Le majeur de dix-huit ans est pleinement responsable. \n" +
                "    (5) L'âge de l'auteur se calcule à la date de la commission de l'infraction."))
        chapter.add(Chapter("Article 81 — Menaces.", "(1) La responsabilité pénale ne peut résulter du fait d'un individu soumis à une menace imminente et non autrement évitable de mort ou de blessures graves telles que prévues au présent code. \n" +
                "Toutefois, si le fait est une infraction punissable de la peine de mort ou s'il a eu pour effet de provoquer la mort ou les blessures susvisées, l'auteur ne bénéficie que de l'excuse atténuante. \n" +
                "(2) Le présent article n'est pas applicable à celui qui s'est volontairement exposé au risque de telles menaces. "))

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
            R.id.chapt1 -> {
//                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Chap7CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
//                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Chap9CodePenal::class.java)
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