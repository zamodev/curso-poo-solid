package src.openClosed.example.ocp;

public class NotificationService {
    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }
    public void send(String message){
        notifier.send(message);
    }
}
