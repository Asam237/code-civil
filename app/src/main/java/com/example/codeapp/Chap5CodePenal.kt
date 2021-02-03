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

class Chap5CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap5_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 22 — Conditions préalables à l'exécution.", "    (1) Toute condamnation à mort est soumise au Président de la République en vue de l'exercice de son droit de grâce. \n" +
                "(2) Tant qu'il n'a pas été statué par le Président de la République sur la grâce du condamné, aucune condamnation à mort ne peut recevoir exécution. \n" +
                "(3) La femme enceinte ne subit la peine de mort qu'après son accouchement. \n" +
                "(4) Aucune exécution ne peut avoir lieu les dimanches et jours fériés. "))
        chapter.add(Chapter("Article 23 — Exécution.", "    (1) Le condamné à mort est exécuté par fusillade ou pendaison suivant ce qui est décidé par l'arrêt portant condamnation. L'exécution est publique, sauf s'il en est autrement décidé par la décision de rejet du recours en grâce. \n" +
                "(2) Les corps des suppliciés sont remis à leurs familles, si elles les réclament, à charge pour elles de les faire inhumer sans aucun appareil. \n" +
                "(3) Le procès-verbal d'exécution et éventuellement un communiqué officiel peuvent seuls être publiés dans la presse. \n" +
                "(4) Un décret fixe les conditions d'application du présent article."))
        chapter.add(Chapter("Article 24 — Emprisonnement.", "L'emprisonnement est une peine privative de liberté pendant laquelle le condamné est astreint au travail sauf décision contraire et motivée de la juridiction."))
        chapter.add(Chapter("Article 25 (nouveau. — L. N° 78-11 du 29 décembre 1978).Pécule.", "    (1) Le produit du travail du détenu est affecté ainsi qu'il suit : \n" +
                "◦ 2/3 au Trésor ; \n" +
                "◦ 1/3 à constituer le pécule. \n" +
                "(2) Les modalités d'application du présent article, notamment les conditions de gestion du pécule, sont fixées par décret."))
        chapter.add(Chapter("Article 26 — Abrogé L. n° 91/007 du 30 juillet 1991 modifiant l'article 2 de la loi n° 90/061 du 19 décembre 1990", "Détention. \n" +
                "La détention est une peine privative de liberté prononcée à raison d'un crime ou d'un délit politique pendant laquelle les condamnés ne sont pas astreints au travail et subissent leur peine dans des établissements spéciaux. A défaut, ils sont séparés des condamnés de droit commun."))
        chapter.add(Chapter("Article 27 — Début de la peine.", "    (1) Si le condamné n'est pas en état de détention préventive ou si un mandat d'arrêt ou de dépôt n'est pas décerné contre lui à l'audience dans les conditions prévues par le Code de Procédure Pénale, la peine privative de liberté ne peut être mise à exécution que lorsque la condamnation est devenue définitive. \n" +
                "(2) Si une femme condamnée à une peine privative de liberté est enceinte ou vient d'accoucher, elle ne subit sa peine que six semaines après son accouchement. \n" +
                "(3) La femme enceinte placée en détention préventive continue jusqu'à l'expiration du délai visé à l'alinéa précédent à bénéficier du régime de la détention préventive. \n" +
                "(4) Le mari et la femme condamnés pour des infractions différentes à une peine d'emprisonnement inférieure à un an et non détenues au jour du jugement peuvent, sur leur demande, ne pas subir simultanément leur peine si, justifiant d'un domicile commun certain, ils ont à leur charge et sous leur garde un enfant âgé de moins de dix-huit ans. "))
        chapter.add(Chapter("Article 28 — Calcul de la peine.", "    (1) La peine privative de liberté exprimée en jours se calcule par vingt-quatre heures. \n" +
                "(2) La peine d'un mois est de trente jours. \n" +
                "(3) La peine exprimée en mois et en années se calcule de date à date. \n" +
                "(4) Sous réserve des dispositions de l'article 53, le point de départ de la peine est fixé : \n" +
                "a) Au jour où le condamné est incarcéré en exécution de la condamnation ; \n" +
                "b) En cas de confusion de peines au jour de la première incarcération en exécution de l'une des condamnations confondues. \n" +
                "(5) En cas d'évasion, la période pendant laquelle le condamné a été en fuite est exclue du calcul de la durée de la peine. "))
        chapter.add(Chapter("Article 29 — Séparation des mineurs.", "Les mineurs de dix-huit ans subissent leur peine privative de liberté dans des établissements spéciaux. \n" +
                "A défaut, ils sont séparés des détenus majeurs."))

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
                val intent = Intent(this, Chap4CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
//                Toast.makeText(this, "Chapitre deux selectionne", Toast.LENGTH_LONG).show()
                val intent = Intent(this, Chap6CodePenal::class.java)
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