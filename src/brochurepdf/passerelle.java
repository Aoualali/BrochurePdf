package brochurepdf;

import brochurepdf.BateauVoyageur;
import brochurepdf.Equipements;
import brochurepdf.Fret;
import brochurepdf.Bdd;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Pour editer le fichier
 *
 * @author Oualali.A
 * @version 1.0
 */
public class passerelle {

    public passerelle() {
    }

    /**
     *
     * @param unIdBateau l'id du bateau
     * @return une ArrayList des equipement par rapport un id du bateau
     * @throws Exception peut retourne une Exception SQLException
     */
    public static ArrayList<Equipements> chargerLesEquipements(int unIdBateau)
            throws Exception {
        ArrayList<Equipements> lesequipementsparbateau = new ArrayList();

        Bdd cnx = new Bdd();
        cnx.connexion();

        Statement statement = cnx.getConnection().createStatement();

        ResultSet result = statement.executeQuery("SELECT posseder.id_equipement,equipement.libelle FROM posseder,equipement,bateau WHERE bateau.id_bateau=posseder.id_bateau AND equipement.id_equipement = posseder.id_equipement AND posseder.id_bateau=" + unIdBateau);

        if (!result.next()) {

            System.out.println("aucun bateau trouve dans la base de donnees");

        } else {
            Equipements equipeme = new Equipements(result.getInt(1), result.getString(2));
            lesequipementsparbateau.add(equipeme);
            while (result.next()) {

                Equipements equipement = new Equipements(result.getInt(1), result.getString(2));
                lesequipementsparbateau.add(equipement);
                equipement = null;
            }
        }

        statement.close();
        result.close();
        return lesequipementsparbateau;
    }

    /**
     *
     * @return ArrayList retourne des information concernant les bateau voyageur
     * @throws Exception peut retourne une Exception SQLException
     */
    public static ArrayList<BateauVoyageur> chargerLeBateauVoyageur()
            throws Exception {
        ArrayList<BateauVoyageur> bateauvoyageur = new ArrayList();

        Bdd cnx = new Bdd();
        cnx.connexion();

        Statement statement = cnx.getConnection().createStatement();
        ResultSet result = statement.executeQuery("SELECT id_bateauVoyageur,vitesse,cheminImage,id_bateau,bateau.libelle,capacite,longeur,largeur,GROUP_CONCAT(id_equipement) as idequip,GROUP_CONCAT(equipement.libelle) as libequip from bateauvoyageur,bateau,equipement WHERE bateauvoyageur.id_bateauVoyageur = bateau.id_bateau GROUP by id_bateauVoyageur");
        if (!result.next()) {

            System.out.println("aucun bateau trouve dans la base de donnees");

        } else {

            BateauVoyageur b0 = new BateauVoyageur(result.getInt("vitesse"), result.getString("cheminImage"), new Equipements(result.getInt("idequip"), result.getString("libequip")), result.getInt("id_bateau"), result.getString("bateau.libelle"), result.getInt("longeur"), result.getInt("largeur"));
            bateauvoyageur.add(b0);
            while (result.next()) {
                BateauVoyageur b = new BateauVoyageur(result.getInt("vitesse"), result.getString("cheminImage"), new Equipements(result.getInt("idequip"), result.getString("libequip")), result.getInt("id_bateau"), result.getString("bateau.libelle"), result.getInt("longeur"), result.getInt("largeur"));
                bateauvoyageur.add(b);
            }
        }

        statement.close();
        result.close();

        return bateauvoyageur;
    }

    /**
     *
     * @return ArrayList des bateau Fret
     * @throws Exception peut retourne une Exception SQLException
     */
    public static ArrayList<Fret> chargerLeBateauFret()
            throws Exception {
        ArrayList<Fret> bateauFret = new ArrayList();

        Bdd cnx = new Bdd();
        cnx.connexion();

        Statement statement = cnx.getConnection().createStatement();

        ResultSet resultat = statement.executeQuery("SELECT id_bateaufret,poidMax,cheminImage,id_bateau,bateau.libelle,capacite,longeur,largeur,GROUP_CONCAT(id_equipement) as idequip,GROUP_CONCAT(equipement.libelle) as libequip from fret,bateau,equipement WHERE fret.id_bateaufret = bateau.id_bateau GROUP by id_bateaufret");

        if (!resultat.next()) {
            System.out.println("aucun bateau fret trouve dans la base de donnees");

        } else {

            Fret f0 = new Fret(resultat.getInt("poidMax"), resultat.getString("cheminImage"), new Equipements(resultat.getInt("idequip"), resultat.getString("libequip")), resultat.getInt("id_bateau"), resultat.getString("bateau.libelle"), resultat.getInt("longeur"), resultat.getInt("largeur"));
            bateauFret.add(f0);

            while (resultat.next()) {
                Fret f = new Fret(resultat.getInt("poidMax"), resultat.getString("cheminImage"), new Equipements(resultat.getInt("idequip"), resultat.getString("libequip")), resultat.getInt("id_bateau"), resultat.getString("bateau.libelle"), resultat.getInt("longeur"), resultat.getInt("largeur"));
                bateauFret.add(f);
            }
        }

        statement.close();
        resultat.close();

        return bateauFret;
    }
}
