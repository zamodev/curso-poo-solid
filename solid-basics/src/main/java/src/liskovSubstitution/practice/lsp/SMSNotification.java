package src.liskovSubstitution.practice.lsp;

public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando notificacion por SMS..." + message);
    }
}
