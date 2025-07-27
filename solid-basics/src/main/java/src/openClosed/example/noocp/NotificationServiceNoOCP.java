package src.openClosed.example.noocp;

public class NotificationServiceNoOCP {
    private NotifierEmailNoOCP notifierEmail;
    private NotifierSMSNoOCP notifierSMSNoOCP;

    public void setNotifierEmail(NotifierEmailNoOCP notifierEmail) {
        this.notifierEmail = notifierEmail;
    }

    public void setNotifierSMSNoOCP(NotifierSMSNoOCP notifierSMSNoOCP) {
        this.notifierSMSNoOCP = notifierSMSNoOCP;
    }

    public void send(String message){
        notifierEmail.send(message);
    }

    public void sendSMS(String message){
        notifierSMSNoOCP.send(message);
    }
}
