package src.dependencyInversion.practice.srp;

public class MessengerSMS implements Messenger{
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando por SMS: " + message);
    }
}
