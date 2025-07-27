package src.dependencyInversion.practice.srp;

public class MessengerService {
    private Messenger messenger;

    public MessengerService(Messenger messenger) {
        this.messenger = messenger;
    }

    public void send(String message){
        messenger.sendMessage(message);
    }
}
