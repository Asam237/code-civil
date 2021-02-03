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

class Chap7CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap7_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 74 — Peine et responsabilité.", "    (1) Aucune peine ne peut être prononcée qu'à l'encontre d'une personne pénalement responsable. \n" +
                "    (2) Est pénalement responsable celui qui volontairement commet les faits caractérisant les éléments constitutifs d'une infraction avec l'intention que ces faits aient pour conséquence la réalisation de l'infraction. \n" +
                "    (3) Sauf lorsque la loi en dispose autrement, la conséquence même voulue d'une omission n'entraîne pas de responsabilité pénale. \n" +
                "    (4) Sauf lorsque la loi en dispose autrement, il ne peut exister de responsabilité pénale que si les conditions de l'alinéa 2 sont remplies. \n" +
                "Toutefois, en matière contraventionnelle, la responsabilité pénale existe, alors même que l'acte ou l'omission ne sont pas intentionnels ou que la conséquence n'en a pas été voulue. "))
        chapter.add(Chapter("Article 75 — Ignorance et mobile.", "L'ignorance de la loi et le mobile n'influent pas sur la responsabilité pénale."))
        chapter.add(Chapter("Article 76 — Exécution de la loi.", "Ne constitue aucune infraction le fait ordonné ou autorisé par la loi et accompli conformément à la loi."))

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