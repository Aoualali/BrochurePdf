package brochurepdf;

/**
 * Traitement sur les equipements
 *
 * @author Oualali.A
 * @version 1.0
 */
public class Equipements {

    private int idEquip;

    private String libEquip;

    /**
     *
     * @param idEquip retourne id equipement
     * @param libEquip retourne le libelle de l'equipement
     */
    public Equipements(int idEquip, String libEquip) {
        this.idEquip = idEquip;
        this.libEquip = libEquip;
    }

    /**
     *
     * @return retourne une chaine de caracter pour les equipements
     */
    public String toString() {
        return "Equipements{" + libEquip + '}';
    }

    /**
     *
     * @return l'id de l'equipement
     */
    public int getIdEquip() {
        return idEquip;
    }

    /**
     *
     * @param idEquip modifie l'id de l'equipement
     */
    public void setIdEquip(int idEquip) {
        this.idEquip = idEquip;
    }

    /**
     *
     * @return le libelle de l'equipement
     */
    public String getLibEquip() {
        return libEquip;
    }

    /**
     *
     * @param libEquip modifie le libelle de l'equipement
     */
    public void setLibEquip(String libEquip) {
        this.libEquip = libEquip;
    }
}
