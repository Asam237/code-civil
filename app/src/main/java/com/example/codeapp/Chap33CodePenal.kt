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

class Chap33CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap33_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 131 — (L.. n°77 /23 du 6 décembre 1977).Définition du fonctionnaire.", "Est considéré comme fonctionnaire, pour l'application de toute loi pénale, tout magistrat, tout officier public ou ministériel, tout préposé ou commis de l'Etat ou toute autre personne morale de droit public, d'une société d'Etat ou d'économie mixte, d'un officier public ou ministériel, tout militaire des forces armées ou de gendarmerie, tout agent de la sûreté nationale ou de l'administration pénitentiaire et toute personne chargée même occasionnellement d'un service, d'une mission ou d'un mandat public, agissant dans l'exercice ou à l'occasion de l'exercice de ses fonctions."))
        chapter.add(Chapter("Article 132 — Aggravation pour les fonctionnaires.", "    (1) Sous réserve des peines plus sévères s'il échet, est puni d'un emprisonnement de six mois à cinq ans le fonctionnaire coupable de violence contre autrui. \n" +
                "    (2) Les peines prévues aux articles 189 (copie de documents administratifs) ; 206 (documents, etc...), 207 (certificats officiels), 291 (1) (arrestation illégale) ; 292 (travail forcé), 299 (violation de domicile), 300 (violation de correspondance), 310 (secret professionnel), 315 (contrefaçon de certificat) sont doublées lorsque le coupable est un fonctionnaire."))
        chapter.add(Chapter("Article 132 bis — (Loi n° 97/009 du 10 janvier 1997) Torture.", "    (1) Est puni de l'emprisonnement à vie, celui qui, par la torture, cause involontairement la mort d'autrui. \n" +
                "    (2) La peine est un emprisonnement de dix (10) à vingt (20) ans, lorsque la torture cause à la victime la privation permanente de l'usage de tout ou partie d'un membre, d'un organe ou d'un sens. \n" +
                "    (3) La peine et un emprisonnement de cinq (5) ans à dix (10) ans et une amende de 100 000 à 1 000 000 de francs lorsque la torture cause à la victime une maladie ou une incapacité de travail supérieure à trente (30) jours. \n" +
                "    (4) La peine est un emprisonnement de deux (2) à cinq (5) ans et une amende de 50 000 à 200 000 francs, lorsque la torture cause à la victime soit une maladie ou une incapacité de travail égale ou inférieure à trente (30) jours, soit des douleurs ou des souffrances mentales ou morales. \n" +
                "    (5) Pour l'application du présent article : \n" +
                "        a) Le terme « torture » désigne tout acte par lequel une douleur ou des souffrances aiguës, physiques, mentales ou morales, sont intentionnellement infligées à une personne, par un fonctionnaire ou toute autre personne, agissant à titre officiel ou à son instigation ou avec son consentement exprès ou tacite, aux fins notamment d'obtenir d'elle ou d'une tierce personne des renseignements ou des aveux, de la punir d'un acte qu'elle ou une tierce personne a commis, ou est soupçonnée d'avoir commis, de l'intimider ou de faire pression sur elle ou d'intimider ou de faire pression sur une tierce personne, ou pour tout autre motif fondé sur une forme de discrimination, quelle qu'elle soit \n" +
                "        b) Le terme « torture » ainsi défini ne s'applique pas à la douleur ou aux souffrances résultant de sanctions légitimes, inhérentes à ces sanctions ou occasionnées par elles \n" +
                "        c) Aucune circonstance exceptionnelle, quelle qu'elle soit, qu'il s'agisse de l'état de guerre ou de menace de guerre, d'instabilité politique intérieure ou de tout autre état d'exception ne peut être invoqué pour justifier la torture \n" +
                "        d) L'ordre d'un supérieur ou d'une autorité publique ne peut être invoqué pour justifier la torture. \n" +
                "Les conditions prévues à l'alinéa 1 de l'article 10 du présent Code ne sont pas applicables à la torture. "))
        chapter.add(Chapter("Article 133 — (Loi n° 93/013 du 22 décembre 1993) Déchéances, confiscation et publicité.", "    (1) Les déchéances de l'article 30 du présent Code peuvent être prononcées contre les fonctionnaires coupables des infractions prévues au présent chapitre ou condamnés en application de l'article 89 du présent Code. \n" +
                "Toutefois, dans le cas des articles 134, 134 bis, 135, 136 et 161 du présent code, les déchéances de l'article 30 sont obligatoirement prononcées. \n" +
                "    (2) En cas de condamnation pour les infractions prévues aux articles 134, 134 bis, 135, 136 et 161 du présent Code, la juridiction est tenue de prononcer la confiscation prévue à 'article 35 et d'ordonner la publication de sa décision par voie de presse écrite, de radio ou de télévision."))
        chapter.add(Chapter("Article 134 — (Loi n° 77/ 23 du 6 décembre 1977) Corruption.", "    (1) Est puni d'un emprisonnement de cinq à dix ans et d'une amende de 200.000 à 2.000.000 de francs, tout fonctionnaire ou agent public qui, pour lui-même ou pour un tiers, sollicite, agrée ou reçoit des offres, promesses, dons ou présents pour faire, s'abstenir de faire ou ajourner un acte de sa fonction. \n" +
                "    (2) L'emprisonnement est de 1 à 5 ans et l'amende de 100.000 à 1.000.000 de francs si l'acte n'entrait pas dans les attributions de la personne corrompue, mais a été cependant facilité par sa fonction. \n" +
                "    (3) Est puni des peines prévues à l'alinéa 2 précédent, tout fonctionnaire ou agent public qui sollicite ou accepte une rétribution en espèce ou en nature pour lui-même ou pour un tiers, en rémunération d'un acte déjà accompli ou une abstention passée. "))
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