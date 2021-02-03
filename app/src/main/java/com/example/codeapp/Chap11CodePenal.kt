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

class Chap11CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap11_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 102 — Hostilités contre la patrie.", "Est coupable de trahison et puni de mort tout citoyen qui : \n" +
                "        a) Participe à des hostilités contre la République ; \n" +
                "        b) Favorise ou offre de favoriser lesdites hostilités."))
        chapter.add(Chapter("Article 103 — Autres crimes punis de mort.", "Est coupable de trahison et puni de mort tout citoyen et est coupable d'espionnage et également puni de mort tout étranger qui : \n" +
                "        a) Incite une puissance étrangère à des hostilités contre la République ; \n" +
                "        b) Livre ou offre de livrer à une puissance étrangère ou à ses agents des troupes, des territoires, des installations ou du matériel affectés à la défense nationale ou des secrets de la défense nationale ou s'assure par quelque moyen que ce soit la possession d'un secret de la défense nationale en vue de le livrer à une puissance étrangère ; \n" +
                "        c) En vue de nuire à la défense nationale détériore des constructions, des installations ou matériels ou pratique soit avant, soit après leur achèvement des malfaçons de nature à les empêcher de fonctionner normalement ou à provoquer un accident. "))
        chapter.add(Chapter("Article 104 — Peines de droit commun.", "En cas de réduction de la peine prévue par les articles 102 et 103 la peine privative de liberté est celle de l'emprisonnement."))
        chapter.add(Chapter("Article 105 — Atteintes punies d'un maximum de dix ans.", "Est puni d'un emprisonnement de un à dix ans et d'une amende de 100.000 à 10 millions de francs ou de l'une de ces deux peines seulement, celui qui en temps de paix : \n" +
                "        1. Dans un but autre que de le livrer à une puissance étrangère s'assure la possession d'un secret de la défense nationale ou le révèle à une personne non qualifiée ; \n" +
                "        2. Dans l'intention de les livrer à une puissance étrangère, rassemble des renseignements, objets, documents ou procédés dont la réunion et l'exploitation sont de nature à nuire à la défense nationale ; \n" +
                "        3. S'introduit à l'aide de moyens frauduleux dans une installation, navire, aéronef ou véhicule affectés à la défense nationale ; \n" +
                "        4. Exécute des dessins, levées ou opérations photographiques ou topographiques à l'intérieur des installations militaires ou autour d'elles dans une zone d'interdiction fixée par les autorités militaires et sans leur autorisation ; \n" +
                "        5. Séjourne au mépris d'une interdiction édictée par l'autorité compétente, dans un rayon déterminé autour d'une installation militaire ; \n" +
                "        6. Survole sans autorisation le territoire de la république dans un aéronef étranger ; \n" +
                "        7. Organise d'une manière occulte un moyen de correspondance ou de transmission à distance susceptible de nuire à la défense nationale ; \n" +
                "        8. Par des actes non approuvés par le Gouvernement expose la République à des représailles \n" +
                "        9. (L.70.LF – 9 du 20 mai 1970) S'engage ou s'entraîne sans autorisation préalable des autorisés camerounaises habilitées, dans les forces armées ou de police étrangères, et se livre à des activités nuisibles à la défense nationale ou des activités susceptibles d'exposer éventuellement la République à une rébellion ou à une insurrection. "))
        chapter.add(Chapter("Article 1 — Aucune exemption.", "La loi pénale s'impose à tous. "))
        chapter.add(Chapter("Article 1 — Aucune exemption.", "La loi pénale s'impose à tous. "))

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
                val intent = Intent(this, Chap22CodePenal::class.java)
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