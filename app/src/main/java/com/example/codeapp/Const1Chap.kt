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

class Const1Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_const1_chap)
        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art. 5.", "(1) Le Président de la République est le Chef de l’État.\n (2) Élu de la Nation tout entière, il incarne l’unité nationale ; Il définit la politique de la nation ; Il veille au respect de la Constitution ; Il assure, par son arbitrage, le fonctionnement régulier des pouvoirs publics ; Il est le garant de l’indépendance nationale, de l’intégrité du territoire, de la permanence et de la continuité de l’État, du respect des traités et accords internationaux. "))
        chapter.add(Chapter("Art. 6.", "(1) Le Président de la République est élu au suffrage universel direct, égal et secret, à la majorité des suffrages exprimés. \n" +
                "(2) Le Président de la République est élu pour un mandat de sept (7) ans renouvelables une fois. \n" +
                "(3) L’élection a lieu vingt (20) jours au moins et cinquante (50) jours au plus avant l’expiration des pouvoirs du Président de la République en exercice. \n" +
                "(4) En cas de vacance de Présidence de la République pour cause de décès, de démission ou d’empêchement définitif constaté par le Conseil constitutionnel, le scrutin pour l’élection du nouveau Président de la République doit impérativement avoir lieu vingt (20) jours au moins et quarante (40) au plus après l’ouverture de la vacance. \n" +
                "a- l’intérim du Président de la République est exercé de plein droit, jusqu'à l’élection du nouveau Président de la République, par le président du Sénat, et si ce dernier est, à son tour, empêché, par son suppléant, suivant l’ordre de préséance du Sénat. \n" +
                "b- Le Président de la République par intérim - le Président du Sénat ou son suppléant - ne peut modifier ni la Constitution, ni la composition du gouvernement. Il ne peut recourir au référendum. Il ne peut être candidat à l’élection organisée pour la Présidence de la République. \n" +
                "(5) Les candidats aux fonctions de Président de la République doivent être des citoyens camerounais d’origine, jouir de leurs droits civiques et politique et avoir trente - cinq (35) ans révolus à la date de l’élection. \n" +
                "(6) le régime de l’élection à la Présidence de la République est fixé par la loi."))
        chapter.add(Chapter("Art. 7.", "(1) le Président de la République élu entre en fonction dès sa prestation de serment. \n" +
                "(2) Il prête serment devant le peuple camerounais, en présence des membres du Parlement, du Conseil constitutionnel et de la Cour Suprême réunis en séance solennelle. Le serment est reçu par le Président de l’Assemblée Nationale. \n" +
                "(3) La formule du serment et les modalités d’application des dispositions des alinéas 1 et 2 ci - dessus sont fixées par la loi. (4) Les fonctions de Président de la République sont incompatibles avec toute autre fonction publique élective ou toute activité professionnelle. "))
        chapter.add(Chapter("Art. 8.", "(1) Le Président de la République représente l’État dans tous les actes de la vie publique. \n" +
                "(2) Il est le Chef des Forces Armées. \n" +
                "(3) Il veille à la sécurité intérieure et extérieure de la République. \n" +
                "(4) Il accrédite les ambassadeurs et les envoyés extraordinaires auprès des puissances étrangères. Les ambassadeurs et les envoyés extraordinaires des puissances étrangères sont accrédités auprès de lui. \n" +
                "(5) Le Président de la République promulgue les lois dans les conditions prévues à l’article 31 ci - dessous.\n" +
                "(6) Le Président de la République saisit le Conseil constitutionnel dans les conditions déterminées par la Constitution. (7) Il exerce le droit de grâce après avis du Conseil supérieur de la Magistrature. \n" +
                "(8) Il exerce le pouvoir réglementaire. \n" +
                "(9) Il crée et organise les services publics de l’État. \n" +
                "(10) Il nomme aux emplois civils et militaires de l’État. \n" +
                "(11) Il confère les décorations et les distinctions honorifiques de la République. \n" +
                "(12) Le Président de la République peut, en cas de nécessité et après consultation du Gouvernement, des bureaux de l’Assemblée Nationale et du Sénat, prononcer dissolution de l’Assemblée Nationale. L’élection d’une nouvelle Assemblée a lieu conformément aux dispositions de l’article 15 alinéa 4 ci - dessous. "))
        chapter.add(Chapter("Art. 9.", "(1) Le Président de la République peut, lorsque les circonstances l’exigent, proclamer par décret, l’état d’urgence qui lui confère des pouvoirs spéciaux dans les conditions fixées par la loi. \n" +
                "(2) Le Président de la République peut, en cas de péril grave menaçant l’intégrité du territoire, la vie, l’indépendance ou les institutions de la République, proclamer, par décret, l’état d’exception et prendre toutes mesures qu’il juge nécessaires. Il en informe la Nation par voie de message."))
        chapter.add(Chapter("Art. 10.", "(1) le Président de la République nomme le Premier ministre et, sur proposition de celui - ci, les autres membres du Gouvernement. Il fixe leurs attributions ; Il met fin à leurs fonctions ; Il préside les conseils ministériels. \n" +
                "(2) Le Président de la République peut déléguer certains de ses pouvoirs au Premier Ministre, aux autres membres du Gouvernement et à certains hauts responsables de l’administration de l’État, dans le cadre de leurs attributions respectives. \n" +
                "(3) En cas d’empêchement temporaire, le Président de la République charge le Premier ministre ou, en cas d’empêchement de celui - ci un autre membre du Gouvernement, d’assurer certaines de ses fonctions, dans le cadre d’une délégation expresse. Chapitre II Du Gouvernement "))
        chapter.add(Chapter("Art. 11.", "(1) le Gouvernement est chargé de la mise en œuvre de la politique de la Nation telle que définie par le président de la République. (2) Il est responsable devant l’Assemblée Nationale dans les conditions et selon les procédures prévues à l’article 34 ci - dessous."))
        chapter.add(Chapter("Art. 12.", "(1) le premier Ministre est le Chef du Gouvernement et dirige l’action de celui - ci. (2) Il est chargé de l’exécution des lois. (3) Le Premier ministre exerce le pouvoir réglementaire et nomme aux emplois civils, sous réserve des prérogatives reconnues au Président de la République dans ces domaines. (4) Il dirige tous les services administratifs nécessaires à l’accomplissement de sa mission. (5) Il peut déléguer certains de ses pouvoirs aux membres du Gouvernement et à des hauts responsables de l’administration de l’État."))
        chapter.add(Chapter("Art. 13.", "Les fonctions de membre du Gouvernement et assimilés sont incompatibles avec l’exercice de tout mandat parlementaire, la présidence d’un exécutif ou d’une assemblée d’une collectivité territoriale décentralisée, toute fonction de représentation professionnelle."))
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
                val intent = Intent(this, Const2Chap::class.java)
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