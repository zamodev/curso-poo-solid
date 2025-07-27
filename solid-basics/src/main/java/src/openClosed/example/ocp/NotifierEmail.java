package src.openClosed.example.ocp;

public class NotifierEmail implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Enviando por email: " + message);
    }
}
