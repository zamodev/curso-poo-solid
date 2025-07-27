package src.openClosed.practice.noocp;

public class PaymentProcessorNoOCP {
    private CardPaymentNoOCP cardPaymentNoOCP;

    public void setCardPaymentNoOCP(CardPaymentNoOCP cardPaymentNoOCP) {
        this.cardPaymentNoOCP = cardPaymentNoOCP;
    }

    public void pay(double amount){
        cardPaymentNoOCP.pay(amount);
    }
}
