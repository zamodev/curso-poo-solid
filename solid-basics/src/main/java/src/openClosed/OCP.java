package src.openClosed;

import src.openClosed.example.noocp.NotificationServiceNoOCP;
import src.openClosed.example.noocp.NotifierEmailNoOCP;
import src.openClosed.example.noocp.NotifierSMSNoOCP;
import src.openClosed.example.ocp.NotificationService;
import src.openClosed.example.ocp.Notifier;
import src.openClosed.example.ocp.NotifierEmail;
import src.openClosed.example.ocp.NotifierSMS;
import src.openClosed.practice.noocp.CardPaymentNoOCP;
import src.openClosed.practice.noocp.PaymentProcessorNoOCP;
import src.openClosed.practice.ocp.CreditCardPayment;
import src.openClosed.practice.ocp.PayPalPayment;
import src.openClosed.practice.ocp.PaymentService;
import src.utils.Utils;

public class OCP extends Utils {
    public static void main(String[] args) {
        msg("Sin OCP");
        NotifierEmailNoOCP notifierEmailNoOCP = new NotifierEmailNoOCP();
        NotificationServiceNoOCP notificationServiceNoOCP = new NotificationServiceNoOCP();
        notificationServiceNoOCP.setNotifierEmail(notifierEmailNoOCP);
        notificationServiceNoOCP.send("Hola, soy un mensaje sin OCP");
        NotifierSMSNoOCP notifierSMSNoOCP = new NotifierSMSNoOCP();
        notificationServiceNoOCP.setNotifierSMSNoOCP(notifierSMSNoOCP);
        notificationServiceNoOCP.sendSMS("Hola, soy un mensaje sin OCP por SMS");
        //
        msg("Con OCP");
        Notifier notifierEmail = new NotifierEmail();
        NotificationService notificationService = new NotificationService();
        notificationService.setNotifier(notifierEmail);
        notificationService.send("Hola, soy un mensaje con OCP por email");

        Notifier notifierSMS = new NotifierSMS();
        notificationService.setNotifier(notifierSMS);
        notificationService.send("Hola, soy un mensaje con OCP por SMS");

        //
        msg("Tarea práctica sin OCP");
        CardPaymentNoOCP cardPaymentNoOCP = new CardPaymentNoOCP();
        PaymentProcessorNoOCP paymentProcessorNoOCP = new PaymentProcessorNoOCP();
        paymentProcessorNoOCP.setCardPaymentNoOCP(cardPaymentNoOCP);
        paymentProcessorNoOCP.pay(100.0);

        //PayPalPaymentNoOCP payPalPaymentNoOCP = new PayPalPaymentNoOCP();
        //paymentProcessorNoOCP.setCardPaymentNoOCP(payPalPaymentNoOCP);

        msg("Tarea práctica con OCP");
        PaymentService paymentService = new PaymentService();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        paymentService.setPayments(creditCardPayment);
        paymentService.pay(200.0);

        PayPalPayment payPalPayment = new PayPalPayment();
        paymentService.setPayments(payPalPayment);
        paymentService.pay(300.0);
    }
}
