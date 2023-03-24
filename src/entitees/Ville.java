package entitees;

import entitees.enumerations.Continent;
public class Ville {

    private String city;
    private int postalCode;
    private String region;
    private String country;
    private Continent continent;
    private int population;
    private int superficie;

    public Ville(String city, int postalCode, String region, String country, Continent continent, int population, int superficie) {
        this.city = city;
        this.postalCode = postalCode;
        this.region = region;
        this.country = country;
        this.continent = continent;
        this.population = population;
        this.superficie = superficie;
    }


    @Override
    public String toString() {
        return "Ville{" +
                "city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", continent=" + continent +
                ", population=" + population +
                ", superficie=" + superficie +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
}
