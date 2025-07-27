package src.openClosed.example.ocp;

public class NotifierSMS implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Enviando por SMS: " + message);
    }
}
