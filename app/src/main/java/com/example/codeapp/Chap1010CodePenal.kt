package com.example.codeapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Chap1010CodePenal : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1010_code_penal)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Article 362 — Classes de contraventions.", "Sous réserve des dispositions de l'article 101 (2) les contraventions sont réparties en quatre classes et les pénalités suivantes leur sont applicables : \n" +
                "        ◦ Celles de la première classe, d'une amende de 200 à 1.200 francs inclusivement ; \n" +
                "        ◦ Celles de la deuxième classe, d'une amende de 1.400 à 2.400 francs inclusivement ; \n" +
                "        ◦ Celles de la troisième classe, d'une amende de 2.600 à 3.600 francs inclusivement ; \n" +
                "        ◦ Celles de la quatrième classe, d'une amende de 4.000 à 25.000 francs inclusivement et d'un emprisonnement de cinq à dix jours ou de l'une de ces deux peines seulement. "))
        chapter.add(Chapter("Article 363 — Récidive.", "Outre le dédoublement du maximum des peines prévu par l'article 88 (1) ( c ), la juridiction peut, en cas de récidive des contraventions des trois premières classes, prononcer une peine d'emprisonnement dont le minimum ne peut être inférieur à cinq jours et le maximum supérieur à dix jours."))
        chapter.add(Chapter("Article R. 364 — Contrainte par corps.", "    1. La contrainte par corps a lieu pour le paiement de l'amende. \n" +
                "    2. Elle est fixée à cinq jours pour les contraventions de 1re classe, à dix jours pour celles de 2e classe et à un mois pour celles de 3e et 4e classe. \n" +
                "Toutefois le condamné ne peut être pour cet objet, détenu plus de quinze jours s'il justifie de son insolvabilité."))
        chapter.add(Chapter("Article R. 365 — Préférence.", "En cas d'insuffisance des biens, les restitutions et les indemnités dues à la partie lésée sont préférées à l'amende."))
        chapter.add(Chapter("Article R. 366 — Restitutions.", "Les restitutions, indemnités et frais entraînent la contrainte par corps et le condamné gardera prison jusqu'à parfait paiement. \n" +
                "Toutefois, si ces condamnations sont prononcées au profit de l'Etat, les condamnés insolvables ne peuvent être détenus plus de quinze jours."))
        chapter.add(Chapter("Article R. 367 — Contraventions de 1re classe.", "Sont punis d'une amende de 200 à 1.200 francs inclusivement : \n" +
                "    1. Ceux qui négligent d'entretenir, réparer ou nettoyer les fours, cheminées ou usines où l'on fait usage du feu \n" +
                "    2. Ceux qui violent la défense de tirer, en certains lieux, des pièces d'artifices. Les pièces saisies sont en outre confisquées \n" +
                "    3. Les hôteliers et autres qui, obligés à l'éclairage, s'en abstiennent, ainsi que ceux qui suppriment un éclairage établi dans un intérêt public \n" +
                "    4. Ceux qui négligent de nettoyer les rues ou passages dans les localités où ce soin est laissé à la charge des habitants \n" +
                "    5. Ceux qui encombrent la voie publique en y déposant ou en y laissant sans nécessité des matériaux ou objets quelconques qui empêchent ou diminuent la liberté ou la sûreté de passage ainsi que ceux qui, contrairement aux lois et aux règlements négligent d'éclairer les matériaux par eux entreposés ou les excavations par eux faites dans les places et voies publiques \n" +
                "    6. Ceux qui jettent ou exposent devant leurs maisons des choses de nature à nuire soit par leur chute, soit par des exhalaisons insalubres \n" +
                "    7. Ceux qui ne respectent pas les lois et règlements concernant la lutte contre les parasites de toute nature dans les campagnes, plantations ou jardins \n" +
                "    8. Ceux qui, sans autre circonstance prévue par des lois, cueillent pour les consommer sur place des fruits appartenant à autrui \n" +
                "    9. Ceux qui, sans avoir été provoqués profèrent non publiquement contre quelqu'un des injures telles que prévues à l'article 307 (1) du Code Pénal \n" +
                "    10. Ceux qui imprudemment, jettent des immondices sur autrui \n" +
                "    11. Ceux qui n'étant ni propriétaires, ni usufruitiers, ni locataires, ni fermiers, ni jouissant d'un terrain ou d'un droit de passage, ou qui, n'étant ni agent, ni préposés d'aucune de ces personnes passent sur ce terrain ou sur une partie de ce terrain s'il est préparé ou ensemencé \n" +
                "    12. Ceux qui sont trouvés en état d'ivresse manifeste dans un lieu public \n" +
                "    13. Le Greffier qui contrevient aux dispositions de l'article 23 D5 du décret n° 66-DF237 du 24 mai 1966 relatif au procès-verbal d'exécution capitale."))
        chapter.add(Chapter("Article R. 368 — Contraventions de 2e classe.", ""))
        chapter.add(Chapter("Article R. 366 — Restitutions.", "Sont punis d'une amende de 1.400 à 2.400 francs inclusivement : \n" +
                "    1. Ceux qui contreviennent aux dispositions concernant l'ouverture des campagnes agricoles \n" +
                "    2. Les hôteliers et logeurs qui tiennent leur registre d'entrée et de sortie d'une façon incomplète ou qui ne le représentent pas aux époques déterminées par les règlements ou lorsqu'ils en sont requis par les autorités commises à cet effet \n" +
                "    3. Ceux qui laissent divaguer : \n" +
                "    • Les déments dangereux qui sont sous leur garde ; \n" +
                "    • Des animaux dangereux ou féroces, ainsi que ceux qui ne retiennent pas leurs animaux lorsqu'ils attaquent ou poursuivent les passants même s'il n'en est résulté aucun dommage. \n" +
                "    4. Ceux qui jettent des corps durs ou des immondices contre les édifices, maisons ou clôtures d'autrui ou dans des jardins ou enclos d'autrui \n" +
                "    5. Ceux qui n'étant ni propriétaires, ni usufruitiers, ni jouissant d'un terrain ou d'un droit de passage, y sont entrés avant que la récolte ne soit faite \n" +
                "    6. Ceux qui font ou laissent passer leurs véhicules et les animaux dont ils ont la garde sur le terrain d'autrui préparé, ensemencé ou chargé d'une récolte, en quelque saison que ce soit, ou dans un bois taillis appartenant à autrui \n" +
                "    7. Ceux qui emploient dans un débit de boissons à consommer sur place des femmes de moins de dix-huit ans, à l'exception de celles appartenant à la famille du débitant \n" +
                "    8. Ceux qui par négligence ou imprudence dégradent de quelque manière que ce soit une installation ou les appareils d'une installation téléphonique ou télégraphique."))

        var adapter = CustomAdapter(chapter)

        rv.adapter = adapter
    }
}