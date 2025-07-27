package src.liskovSubstitution.practice.lsp;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Enviando notificacion por Email..." + message);
    }
}
