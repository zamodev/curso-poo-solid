package src.singleResponsibility.example.srp;

public class Reports {
    public void generateReport(EmployeeSRP employeeSRP){
        System.out.println("Generando reporte de:" + employeeSRP.getRole() + " " + employeeSRP.getNombre());
    }
}
