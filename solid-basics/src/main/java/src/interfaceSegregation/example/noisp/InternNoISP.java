package src.interfaceSegregation.example.noisp;

public class InternNoISP implements TaskNoISP{
    @Override
    public void generateReport() {
        System.out.println("Generating report for intern.");
    }

    @Override
    public void calulatePayment() {
        System.out.println("No hay pago para un pasante.");
    }
}
