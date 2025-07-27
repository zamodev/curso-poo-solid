package src.interfaceSegregation.example.noisp;

public class EmployeeNoISP implements TaskNoISP{
    @Override
    public void generateReport() {
        System.out.println("Generating report for employee.");
    }

    @Override
    public void calulatePayment() {
        System.out.println("Calculating payment for employee.");
    }
}
