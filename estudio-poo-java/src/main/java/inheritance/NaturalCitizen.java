package inheritance;

import encapsulation.Citizen;

public class NaturalCitizen extends Citizen {
    private String countryOrigin;

    public NaturalCitizen(String name, String birhdate, int pin, String countryOrigin) {
        super(name, birhdate, pin);
        this.countryOrigin = countryOrigin;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
