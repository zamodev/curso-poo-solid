package polimorphism;

import abstraction.Phone;

public class SmartPhone extends Phone {
    @Override
    public void dial() {
        System.out.println("Marcando por comando de voz");
    }
}
