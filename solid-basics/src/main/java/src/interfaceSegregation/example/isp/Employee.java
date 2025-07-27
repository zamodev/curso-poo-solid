package src.interfaceSegregation.example.isp;

public class Employee implements Report, Payment{
    @Override
    public void calulatePayment() {
        System.out.println("Calculating payment for employee con ISP");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for employee con ISP");
    }
}
