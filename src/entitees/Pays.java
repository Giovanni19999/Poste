package entitees;

public class Pays {
    private String nom;
    private String continent;
    private int nbHab;

    public Pays(String nom, String continent, int nbHab) {
        this.nom = nom;
        this.continent = continent;
        this.nbHab = nbHab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }

}
