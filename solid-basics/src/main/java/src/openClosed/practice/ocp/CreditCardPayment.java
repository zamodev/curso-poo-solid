package src.openClosed.practice.ocp;

public class CreditCardPayment implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of: " + amount);
    }
}
