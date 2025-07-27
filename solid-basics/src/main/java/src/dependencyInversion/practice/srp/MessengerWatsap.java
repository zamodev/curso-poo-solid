package src.dependencyInversion.practice.srp;

public class MessengerWatsap implements Messenger{
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando por WhatsApp: " + message);
    }
}
