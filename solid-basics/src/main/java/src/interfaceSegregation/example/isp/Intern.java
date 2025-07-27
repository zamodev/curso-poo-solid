package src.interfaceSegregation.example.isp;

public class Intern implements Report{
    @Override
    public void generateReport() {
        System.out.println("Generating report for intern with ISP");
    }
}
