package brochurepdf;

/**
 * traitement sur les bateau
 *
 * @author Oualali.A
 * @version 1.0
 */
public class bateau {

    private int idBat;

    private String nomBat;

    private int longeurBat;

    private int largeurBat;

    /**
     *
     * @param idBat l'id du bateau
     * @param nomBat le nom du bateau
     * @param longeurBat la longeur du bateau
     * @param largeurBat la largeur du bateau
     */
    public bateau(int idBat, String nomBat, int longeurBat, int largeurBat) {
        this.idBat = idBat;
        this.nomBat = nomBat;
        this.longeurBat = longeurBat;
        this.largeurBat = largeurBat;
    }

    /**
     *
     * @return chaine de caracter qui retourne les attribut des bateau
     */
    public String toString() {
        return "Bateau{nomBat=" + nomBat + ", longeurBat=" + longeurBat + ", largeurBat=" + largeurBat + '}';
    }

    /**
     *
     * @return l'id du bateau
     */
    public int getIdBat() {
        return idBat;
    }

    /**
     *
     * @param idBat modifie l'id du bateau
     */
    public void setIdBat(int idBat) {
        this.idBat = idBat;
    }

    /**
     *
     * @return !le nom du bateau
     */
    public String getNomBat() {
        return nomBat;
    }

    /**
     *
     * @param nomBat modifie le nom du bateau
     */
    public void setNomBat(String nomBat) {
        this.nomBat = nomBat;
    }

    /**
     *
     * @return la longeur du bateau
     */
    public int getLongeurBat() {
        return longeurBat;
    }

    /**
     *
     * @param longeurBat modifie la longeur du bateau
     */
    public void setLongeurBat(int longeurBat) {
        this.longeurBat = longeurBat;
    }

    /**
     *
     * @return la largeur du bateau
     */
    public int getLargeurBat() {
        return largeurBat;
    }

    /**
     *
     * @param largeurBat modifie la largeur du bateau
     */
    public void setLargeurBat(int largeurBat) {
        this.largeurBat = largeurBat;
    }
}
