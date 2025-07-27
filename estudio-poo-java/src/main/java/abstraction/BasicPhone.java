package abstraction;

//Ten presente que uno extiende y otro implementa
public class BasicPhone extends Phone implements SonPhone{
    @Override
    public void dial() {
        System.out.println("Marcar a Mamá... ");
    }

    @Override
    public void callMom() {
        super.call();
        System.out.println("Mamá");
    }
}
