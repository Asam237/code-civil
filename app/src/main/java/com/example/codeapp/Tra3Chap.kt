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

class Tra3Chap : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tra3_chap)

        val rv = findViewById<RecyclerView>(R.id.rvChap1CodePenal)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val chapter = ArrayList<Chapter>()
        chapter.add(Chapter("Art.23.", "1) Le contrat de travail est une convention par laquelle un travailleur s’engage à mettre son\n" +
                "activité professionnelle sous l’autorité et la direction d’un employeur, en contrepartie d’une\n" +
                "rémunération.\n" +
                "2) Les contrats de travail sont passés librement."))
        chapter.add(Chapter("Art.24.", "1) Quels que soient le lieu de la conclusion du contrat et la résidence de l’une ou l’autre\n" +
                "partie, tout contrat de travail conclu pour être exécuté au Cameroun, est soumis aux dispositions de\n" +
                "la présente loi.\n" +
                "2) Il en est de même en cas d’exécution partielle au Cameroun d’un contrat de travail initialement\n" +
                "conclu sous l’empire d’une autre législation. Cette dernière disposition n’est cependant pas\n" +
                "applicable aux travailleurs déplacés pour une mission temporaire n’excédant pas six mois.\n" +
                "3) L’existence du contrat est constatée, sous réserve des dispositions de l’article 27, dans les formes\n" +
                "qu’il convient aux parties contractantes d’adopter. La preuve peut être rapportée par tous les\n" +
                "moyens.\n" +
                "4) Le contrat écrit est exempt de tous droits de timbre et d’enregistrement."))
        chapter.add(Chapter("Art.25.", "1) Le contrat de travail peut être conclu pour une durée déterminée ou indéterminée.\n" +
                "a) Le contrat de travail à durée déterminée est celui dont le terme est fixé à l’avance par la volonté\n" +
                "des deux parties. Il ne peut être conclu pour une durée supérieure à deux ans et peut être renouvelé\n" +
                "pour la même durée. Est assimilé à un contrat de travail à durée déterminée mais ne peut être\n" +
                "renouvelé :\n" +
                "• le contrat dont le terme est subordonné à la survenance d’un événement futur et certain dont la\n" +
                "réalisation ne dépend pas exclusivement de la volonté des deux parties, mais qui est indiqué avec\n" +
                "précision ;\n" +
                "• le contrat conclu pour un ouvrage déterminé.\n" +
                "b) Le contrat à durée indéterminée est celui dont le terme n’est pas fixé à l’avance et qui peut cesser\n" +
                "à tout instant par la volonté de l’une ou de l’autre partie, sous réserve du préavis prévu à l’article 34\n" +
                "ci-dessous.\n" +
                "2) Le renouvellement du contrat des travailleurs de nationalité étrangère ne peut intervenir qu’après\n" +
                "visa du ministre chargé du Travail.\n" +
                "3) Le contrat à durée déterminée des travailleurs de nationalité camerounaise ne peut être\n" +
                "renouvelé plus d’une fois avec la même entreprise. Au terme de ce renouvellement et si les relations\n" +
                "de travail se poursuivent, le contrat se transforme en contrat à durée indéterminée.\n" +
                "4) Les dispositions ci-dessus ne s’appliquent pas aux travailleurs recrutés pour effectuer\n" +
                "exclusivement :\n" +
                "• a) un travail temporaire ayant pour objet, soit le remplacement d’un travailleur absent ou dont le\n" +
                "contrat est suspendu, soit l’achèvement d’un ouvrage dans un délai déterminé nécessitant l’emploi\n" +
                "d’une main-d’oeuvre supplémentaire ;\n" +
                "• b) un travail occasionnel ayant pour objet de résorber un accroissement conjoncturel et imprévu\n" +
                "des activités de l’entreprise ou l’exécution de travaux urgents pour prévenir des accidents\n" +
                "imminents, organiser des mesures de sauvetage ou procéder à des réparations de matériel,\n" +
                "d’installations ou de bâtiments de l’entreprise présentant un danger pour les travailleurs ;\n" +
                "• c) un travail saisonnier lié à la nature cyclique ou climatique des activités de l’entreprise.\n" +
                "5) Les conditions d’emploi des travailleurs visées au paragraphe précédent sont fixées par décret pris\n" +
                "après avis de la Commission nationale consultative du travail."))
        chapter.add(Chapter("Art.26.", "1) Les travailleurs visés à l’alinéa 4 de l’article 25 peuvent être recrutés par une entreprise de\n" +
                "travail temporaire.\n" +
                "2) Est considéré comme entrepreneur de travail temporaire, toute personne physique ou morale\n" +
                "dont l’activité exclusive est de mettre à la disposition provisoire d’utilisateurs, des travailleurs qu’elle\n" +
                "embauche et rémunère.\n" +
                "3) Il ne peut être fait appel aux travailleurs visés au paragraphe précédent que pour des tâches non\n" +
                "durables et dans les seuls cas définis à l’article 25 alinéa 4.\n" +
                "4) L’ouverture d’une entreprise de travail temporaire est soumise à l’agrément préalable du ministre\n" +
                "chargé du Travail.\n" +
                "5) Le contrat de travail liant l’entreprise de travail temporaire à un travailleur mis à la disposition\n" +
                "d’un utilisateur, doit être écrit.\n" +
                "6) Pour chaque travailleur mis à la disposition d’un utilisateur, un contrat de mise à disposition doit\n" +
                "être conclu par écrit entre ce dernier et l’entreprise de travail temporaire. Sa durée ne peut excéder\n" +
                "un an avec le même utilisateur.\n" +
                "7) Les modalités d’application du présent article sont fixées par décret pris après avis de la\n" +
                "Commission nationale consultative du travail."))
        chapter.add(Chapter("Art.27.", "1) Tout contrat de travail stipulant une durée déterminée supérieure à trois mois ou\n" +
                "nécessitant l’installation d’un travailleur hors de sa résidence habituelle doit être constaté par écrit.\n" +
                "Une ampliation du contrat est adressée à l’inspecteur du travail du ressort.\n" +
                "2) Le contrat de travail concernant un travailleur de nationalité étrangère doit, avant tout\n" +
                "commencement d’exécution, être visé par le ministre chargé du Travail.\n" +
                "3) La demande de visa incombe à l’employeur. Si le visa est refusé, le contrat est nul de plein droit.\n" +
                "4) Si le ministre chargé du Travail n’a pas fait connaître sa décision dans un délai de deux mois\n" +
                "consécutifs à la réception de la demande de visa, ce dernier sera réputé avoir été accordé.\n" +
                "5) Les modalités d’application du présent article sont fixées par décret pris après avis de la\n" +
                "Commission nationale consultative du travail."))
        chapter.add(Chapter("Art.28.", "1) Il y a engagement à l’essai lorsque l’employeur et le travailleur, en vue de conclure un\n" +
                "contrat définitif, décident au préalable d’apprécier notamment, le premier la qualité des services du\n" +
                "travailleur et son rendement, le second, les conditions, chez l’employeur, de travail, de vie, de\n" +
                "rémunération. D’hygiène, de sécurité ainsi que de climat.\n" +
                "2) L’engagement à l’essai doit être stipulé par écrit. Il ne peut être conclu pour une durée supérieure\n" +
                "au délai nécessaire pour mettre à l’épreuve le personnel engagé, compte tenu des techniques et\n" +
                "usages de la profession. Dans tous les cas l’engagement à l’essai ne peut porter, renouvellement\n" +
                "compris, que sur une période maximale de six mois, sauf en ce qui concerne les cadres pour lesquels\n" +
                "cette période peut être prolongée jusqu’à huit mois.\n" +
                "3) Les délais de recrutement, de route, de formation et de stage ne sont pas compris dans la durée\n" +
                "de l’essai.\n" +
                "4) Le rapatriement des travailleurs déplacés est supporté par l’employeur, quel que soit le motif de la\n" +
                "rupture.\n" +
                "5) La prolongation des services au-delà de l’expiration d’un contrat d’engagement à l’essai, sans\n" +
                "intervention d’un nouveau contrat, vaut engagement définitif, prenant effet à compter du début de\n" +
                "l’essai.\n" +
                "6) Un arrêté du ministre chargé du Travail, pris après avis de la Commission nationale consultative du\n" +
                "travail, fixe les modalités de l’engagement à l’essai."))
        chapter.add(Chapter("Art.29.", "1) Le règlement intérieur est établi par le chef d’entreprise. Son contenu est limité\n" +
                "exclusivement aux règles relatives à l’organisation technique du travail, aux normes et à la procédure\n" +
                "disciplinaires, aux prescriptions concernant l’hygiène et la sécurité du travail, nécessaires à la bonne\n" +
                "marche de l’entreprise.\n" +
                "2) Toutes les autres clauses qui viendraient à y figurer, notamment celles relatives à la rémunération,\n" +
                "seront considérées comme nulles de plein droit, sous réserve des dispositions de l’article 68-4 de la\n" +
                "présente loi.\n" +
                "3) Avant de mettre le règlement intérieur en vigueur, le chef d’entreprise doit le communiquer pour\n" +
                "avis aux délégués du personnel s’il en existe, et pour visa à l’inspecteur du travail du ressort qui peut\n" +
                "exiger le retrait ou la modification des dispositions qui seraient contraires aux lois et règlements.\n" +
                "4) Les modalités de communication, de dépôt et d’affichage du règlement intérieur ainsi que le\n" +
                "nombre de travailleurs de l’entreprise au-dessus duquel l’existence du règlement est obligatoire,\n" +
                "sont fixés par arrêté du ministre chargé du Travail pris après avis de la Commission nationale\n" +
                "consultative du travail."))
        chapter.add(Chapter("Art.30.", "1) Il est interdit à l’employeur d’infliger des amendes.\n" +
                "2) La seule sanction fondée sur le pouvoir disciplinaire de l’employeur qui puisse entraîner la\n" +
                "privation de salaire est celle de la mise à pied qui entraîne l’absence de prestation de travail.\n" +
                "3) La mise à pied est nulle et de nul effet si les conditions suivantes ne sont pas simultanément\n" +
                "remplies :\n" +
                "• a) être d’une durée maximale de huit jours ouvrables, déterminée au moment où elle est\n" +
                "prononcée ;\n" +
                "• b) être notifiée au travailleur par écrit avec indication des motifs pour lesquels elle a été infligée ;\n" +
                "• c) être communiquée dans les quarante-huit heures à l’inspecteur du travail du ressort.\n" +
                "4) Si le grief allégé pour la justifier est reconnu insuffisant par le tribunal, le travailleur à l’encontre\n" +
                "duquel elle a été prononcée perçoit une indemnité compensatrice correspondant au salaire perdu et,\n" +
                "éventuellement des dommages-intérêts, s’il apporte la preuve qu’il a subi de ce fait un préjudice\n" +
                "distinct de celui de la perte du salaire."))
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
                val intent = Intent(this, Tra2Chap::class.java)
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