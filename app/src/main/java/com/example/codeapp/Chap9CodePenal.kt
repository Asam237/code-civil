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

class Chap9CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap9_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 88 (nouveau).- — Récidive.", "(1) Est récidiviste, sauf en ce qui concerne les peines perpétuelles, et encourt le double du maximum de la peine prévue : \n" +
                "a) Celui qui, après avoir été condamné pour crime ou délit, commet une nouvelle infraction qualifiée crime ou délit dans un délai qui commence à courir à compter de la date de la condamnation devenue définitive et qui expire cinq ans après l'exécution de la peine prononcée ou sa prescription \n" +
                "b) Celui qui, après avoir été condamné pour contravention, commet une nouvelle contravention dans un délai qui commence à courir à compter de la date de la condamnation devenue définitive et qui expire douze mois après l'exécution de la peine prononcée ou sa prescription. \n" +
                "(2) Les dispositions du présent article sont applicables entre plusieurs condamnations successives à la détention. "))
        chapter.add(Chapter("Article 89 — Fonctionnaires.", "    (1) La qualité de fonctionnaire, d'officier public ou d'agent chargé d'un service public est une circonstance aggravante de la responsabilité pénale contre ceux d'entre eux qui, hors les cas où la loi règle spécialement les peines encourues pour les crimes et les délits par eux commis, se sont rendus coupables d'autres crimes ou délits qu'ils étaient chargés de prévenir ou de réprimer. \n" +
                "    (2) La peine est alors augmentée dans les conditions prévues à l'article précédent."))

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
                val intent = Intent(this, Chap8CodePenal::class.java)
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