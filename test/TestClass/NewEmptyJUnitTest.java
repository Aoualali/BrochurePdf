/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestClass;

import brochurepdf.BateauVoyageur;
import brochurepdf.Bdd;
import brochurepdf.Equipements;
import brochurepdf.Fret;
import brochurepdf.bateau;
import brochurepdf.passerelle;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oualali.A
 */
public class NewEmptyJUnitTest {

    public static Equipements eq;
    public static bateau ba;
    public static BateauVoyageur baV;
    public static Fret fr;
    public static passerelle pa;

    public NewEmptyJUnitTest() throws Exception {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
        eq = new Equipements(2, "Bar");
        ba = new bateau(1, "Kor'ant", 150, 100);
        baV = new BateauVoyageur(1, "c://", new Equipements(1, "bar"), 1, "kor'ant", 150, 100);
        fr = new Fret(500, "C:\nUsers\nOualali.A\nDocuments\nNetBeansProjects\brochurePdf\ninc\n3.jpg", new Equipements(2, "pont promenade"), 2, "tt", 150, 150);
        pa = new passerelle();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testBdd() throws Exception {

        Bdd bdd = new Bdd();
        bdd.connexion();
        assertEquals(bdd.getConnection(), "true");

    }

    @Test
    public void testEquipement() throws Exception {

        Bdd cnx = new Bdd();
        cnx.connexion();
        Statement statement = cnx.getConnection().createStatement();

        ResultSet resultat = statement.executeQuery("SELECT * from equipement");
        assertEquals(2, eq.getIdEquip());
        assertEquals("Bar", eq.getLibEquip());
        statement.close();
        resultat.close();

    }

    @Test
    public void testBateaut() throws Exception {

        Bdd cnx = new Bdd();
        cnx.connexion();
        Statement statement = cnx.getConnection().createStatement();

        ResultSet resultat = statement.executeQuery("SELECT * from bateau");
        assertEquals(1, ba.getIdBat());
        assertEquals("Kor'ant", ba.getNomBat());

        assertEquals(150, fr.getLargeurBat());
        assertEquals(150, fr.getLongeurBat());

        statement.close();
        resultat.close();

    }

    @Test
    public void testFret() throws Exception {

        Bdd cnx = new Bdd();
        cnx.connexion();
        Statement statement = cnx.getConnection().createStatement();

        ResultSet resultat = statement.executeQuery("SELECT * from Fret");
        assertEquals(500, fr.getPoidMax());
        assertEquals("C:\nUsers\nOualali.A\nDocuments\nNetBeansProjects\"", fr.getImg());

        assertEquals(2, fr.getIdBat());
        assertEquals("tt", fr.getNomBat());

        assertEquals(150, fr.getLargeurBat());
        assertEquals(150, fr.getLongeurBat());

        statement.close();
        resultat.close();

    }

    @Test
    public void testBateauVoyageur() throws Exception {

        Bdd cnx = new Bdd();
        cnx.connexion();
        Statement statement = cnx.getConnection().createStatement();

        baV = new BateauVoyageur(1, "", eq, 1, "kor'ant", 150, 100);

        ResultSet resultat = statement.executeQuery("SELECT * from BateauVoyageur");
        assertEquals(1, baV.getIdBat());

        assertEquals("c://", baV.getLesEquipements());

        assertEquals("pont promenade", baV.getLesEquipements());

        assertEquals(1, baV.getIdBat());

        assertEquals("Kor'ant", baV.getNomBat());

        assertEquals(150, baV.getLargeurBat());
        assertEquals(100, baV.getLongeurBat());

        statement.close();
        resultat.close();

    }

    @Test
    public void testPasserelle() throws Exception {

        assertEquals("[Equipements{Bar}]", pa.chargerLesEquipements(1));

        assertEquals("[Bateau{nomBat=kor'ant, longeurBat=150, largeurBat=100}BateauVoyageur{vitesseBatVoy=150, imagepath=C:\Users\Oualali.A\Documents\NetBeansProjects\BrochurePdf\inc\1.jpg, lesEquipements=Equipements{Acces Handicape,Pont Promenade,Bar,Salon video}}]", pa.chargerLeBateauVoyageur());

        assertEquals("[Bateau{nomBat=tt, longeurBat=150, largeurBat=150}Fret{poidMax=500, imagepath=C:\Users\Oualali.A\Documents\NetBeansProjects\brochurePdf\inc\3.jpg, lesEquipements=Equipements{Acces Handicape,Pont Promenade,Bar,Salon video}}]", pa.chargerLeBateauFret());

    }

}
