package src.openClosed.practice.ocp;

public class PaymentService {
    private Payments payments;

    public void setPayments(Payments payments) {
        this.payments = payments;
    }
    public void pay(double amount){
        payments.pay(amount);
    }
}
