package brochurepdf;

/**
 * Traitement sur les bateaux voyageur
 *
 * @author Oualali.A
 * @version 1.0
 */
public class BateauVoyageur
        extends bateau {

    private int vitesseBatVoy;
    private String imagebatvoy;

    private Equipements lesEquipements;

    /**
     *
     *
     * @return String chaine de caractere
     */
    public String toString() {
        return super.toString() + "BateauVoyageur{vitesseBatVoy=" + vitesseBatVoy + ", imagepath=" + imagebatvoy + ", lesEquipements=" + lesEquipements + '}';
    }

    /**
     *
     * @param vitesseBatVoy retourne la vitesse du bateau voyageur
     * @param imgbatvoy retourne le path de l'image
     * @param lesEquipements retourne la listes des equipement
     * @param idBat retourne id du bateau
     * @param nomBat retourne le nom du bateau
     * @param longeurBat retorune la longeur du bateau
     * @param largeurBat retourne la largeur du bateau
     */
    public BateauVoyageur(int vitesseBatVoy, String imgbatvoy, Equipements lesEquipements, int idBat, String nomBat, int longeurBat, int largeurBat) {
        super(idBat, nomBat, longeurBat, largeurBat);
        this.vitesseBatVoy = vitesseBatVoy;
        this.imagebatvoy = imgbatvoy;
        this.lesEquipements = lesEquipements;
    }

    /**
     *
     * @return le path de l'image
     */
    public String getImagebatvoy() {
        return imagebatvoy;
    }

    /**
     *
     * @param imagebatvoy chemin d'acces vers le fichier
     */
    public void setImagebatvoy(String imagebatvoy) {
        this.imagebatvoy = imagebatvoy;
    }

    /**
     *
     * @return la vitesse du bateau voyageur
     */
    public int getVitesseBatVoy() {
        return vitesseBatVoy;
    }

    /**
     *
     * @param vitesseBatVoy modifie la vitesse du bateau voyageur
     */
    public void setVitesseBatVoy(int vitesseBatVoy) {
        this.vitesseBatVoy = vitesseBatVoy;
    }

    /**
     *
     * @return la listes des equipement par rapport au bateau
     */
    public Equipements getLesEquipements() {
        return lesEquipements;
    }

    /**
     *
     * @param lesEquipements modifie la listes des equipements
     */
    public void setLesEquipements(Equipements lesEquipements) {
        this.lesEquipements = lesEquipements;
    }
}
