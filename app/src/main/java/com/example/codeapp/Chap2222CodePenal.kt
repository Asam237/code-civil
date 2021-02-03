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

class Chap2222CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap2222_code_penal)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 25 — ", "A l'audience fixée par la citation ou par ordonnance ou convenue entre les parties, elles comparaîtront soit en personne, soit par leur avocat-défenseur, soit par leur mandataire, dans les conditions fixées à l'article 2. "))
        chapter.add(Chapter("Article 26 — (Art. 2 du D. du 27 novembre 1947)", "Les audiences des tribunaux sont publiques, à moins que cette publicité ne soit dangereuse pour l'ordre ou les mœurs, auquel cas le tribunal le déclare par jugement préalable. \n" +
                "Dans tous les cas, les jugements en toute matière sont prononcés publiquement."))
        chapter.add(Chapter("Article 27 —", "Les parties seront tenues de s'exprimer avec modération et de garder en tout le respect dû à la Justice. Ceux qui assisteront aux audiences devront se tenir découverts dans le respect et le silence. Tout ce que le président ou le juge de Paix ordonnera pour le maintien de l'ordre à l'audience sera exécuté ponctuellement et à l'instant. La même disposition sera observée dans les lieux où les magistrats et greffiers exerceront les fonctions de leur état. "))
        chapter.add(Chapter("Article 28 —", "Si un ou plusieurs individus, quels qu'ils soient, interrompent le silence, donnent des signes d'approbation ou d'improbation, soit à la défense des parties, soit aux discours et ordres des magistrats, causent ou excitent du tumulte de quelque manière que ce soit, et si après l'avertissement du Juge Président ils ne rentrent pas dans l'ordre sur-le-champ, il leur sera enjoint de se retirer et les résistants seront saisis et déposés à l'instant dans la maison d'arrêt pour 24 heures ; ils seront reçus sur l'ordre du Juge Président, qui sera mentionné au procès-verbal de l'audience ; cette décision ne sera en aucun cas susceptible d'appel. "))
        chapter.add(Chapter("Article 29 —", "Si un délit était commis dans l'enceinte et pendant la durée de l'audience, le Président ou le Juge de Paix à compétence étendue dressera procès-verbal du fait, entendra les prévenus et les témoins et appliquera sans désemparer les peines prononcées par le code pénal, sans préjudice du droit d'appel. Le délinquant pourra être mis en état d'arrestation, alors même qu'il aurait quitté l'enceinte du tribunal. S'il ne peut être arrêté ou s'il ne se présente pas devant le tribunal, le jugement sera rendu par défaut. \n" +
                "S'il s'agit d'un juge de Paix à compétence ordinaire, il pourra procéder à l'arrestation du délinquant ; il dressera procès-verbal du fait, entendra le prévenu et les témoins et adressera, sans retard, le dossier de l'information au Procureur de la République ou au Juge de Paix à compétence étendue du ressort. \n" +
                "Au cas où le fait commis à l'audience ne constituerait qu'une simple contravention, le Juge appliquera les peines de simple police. "))

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
                val intent = Intent(this, Chap111CodePenal::class.java)
                startActivity(intent)
            }
            R.id.chapt3 -> {
                val intent = Intent(this, Chap3333CodePenal::class.java)
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