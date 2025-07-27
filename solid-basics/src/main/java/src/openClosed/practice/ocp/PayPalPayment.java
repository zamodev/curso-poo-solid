package src.openClosed.practice.ocp;

public class PayPalPayment implements Payments{
    @Override
    public void pay(double amount) {
        System.out.println("Processing PayPal payment of: " + amount);
    }
}
