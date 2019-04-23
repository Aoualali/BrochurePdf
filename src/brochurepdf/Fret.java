/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brochurepdf;

/**
 * Traitement sur fret
 *
 * @author Oualali.A
 * @version 1.0
 */
public class Fret extends bateau {

    private int poidMax;
    private String img;
    // Contient le chemin d'accès vers le fichier représentant l'image du bateau.
// Exemple : /images/bateauvoyageur/luceisle.jpg
    private Equipements lesEquipements;
// Indique tous les équipements présents sur le bateau.

    /**
     *
     * @param poidMax le poid max du bateau
     * @param imges le chemin d'acces vers l'image
     * @param lesEquipements la listes des equipements
     * @param idBat id du bateau de fret par raport a la classe bateau
     * @param nomBat le nom du bateau fret par raport a la classe bateau
     * @param longeurBat la longeur du bateau fret par raport a la classe
     * bateauu
     * @param largeurBat la largeur du bateau fret par raport a la classe bateau
     */
    public Fret(int poidMax, String imges, Equipements lesEquipements, int idBat, String nomBat, int longeurBat, int largeurBat) {
        super(idBat, nomBat, longeurBat, largeurBat);
        this.poidMax = poidMax;
        this.img = imges;
        this.lesEquipements = lesEquipements;
    }

    /**
     *
     * @return une chaine de caracter par rapport au attribut
     */
    @Override
    public String toString() {
        return super.toString() + "Fret{" + "poidMax=" + poidMax + ", imagepath=" + img + ", lesEquipements=" + lesEquipements + '}';
    }

    /**
     *
     * @return le chemin vers l'image
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img modifie le chemin
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     *
     * @return le poid max du bateau
     */
    public int getPoidMax() {
        return poidMax;
    }

    /**
     *
     * @param poidMax modifie le poid max
     */
    public void setPoidMax(int poidMax) {
        this.poidMax = poidMax;
    }

}
