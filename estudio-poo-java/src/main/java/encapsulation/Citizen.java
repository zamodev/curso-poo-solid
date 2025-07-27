package encapsulation;

public class Citizen {
    private String name;
    private String birhdate;
    private int pin;

    //Consrtuctor
    public Citizen(String name, String birhdate, int pin) {
        this.name = name;
        this.birhdate = birhdate;
        this.pin = pin;
    }
    //Getters Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirhdate(int pin) {
        if(pin == this.pin) {
            return birhdate;
        }else {
            return "Dato privado";
        }
    }
}
