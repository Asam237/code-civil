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

class Chap3333CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap3333_code_penal)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 36 —", "Seront communiquées au procureur de la République les causes suivantes : \n" +
                "\n" +
                "1°  Celles qui concernent l'ordre public, l'Etat, le Territoire, les domaines, les communes, les établissements publics, les dons et legs au profit des pauvres ; \n" +
                "2°  Celles qui concernent l'état des personnes et les tutelles ; \n" +
                "3°  Les déclinatoires sur incompétences ; \n" +
                "4°  Les règlements de Juges, les récusations et renvois pour parenté et alliance ; \n" +
                "5°  Les prises à partie ; \n" +
                "6°  Les causes des femmes non autorisées par leurs maris, ou même autorisées, lorsqu'il s'agit de leur dot, et qu'elles sont mariées sous le régime dotal, les causes des mineurs, et généralement toutes celles où l'une des parties est défendue par un curateur ; \n" +
                "7°  Les causes concernant ou intéressant les personnes présumées absentes. \n" +
                "Le Procureur de la République pourra néanmoins prendre communication de toutes les autres causes dans lesquelles il croira son ministère nécessaire ; le tribunal ou le Juge de Paix à compétence étendue pourront même l'ordonner d'office. "))
        chapter.add(Chapter("Article 37 —", "Devant les justices de Paix à compétence étendue, les affaires simplement communicables sont jugées sans intervention du ministère public. Devant ces mêmes juridictions, le droit de se porter partie principale est exercé par le Procureur de la République y ayant droit de réquisition."))
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
                val intent = Intent(this, Chap22CodePenal::class.java)
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