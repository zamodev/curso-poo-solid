package src.interfaceSegregation;

import src.interfaceSegregation.example.isp.Employee;
import src.interfaceSegregation.example.isp.Intern;
import src.interfaceSegregation.example.noisp.EmployeeNoISP;
import src.interfaceSegregation.example.noisp.InternNoISP;
import src.interfaceSegregation.practice.isp.SmartTelevision;
import src.interfaceSegregation.practice.isp.Television;
import src.utils.Utils;

public class ISP extends Utils {
    public static void main(String[] args) {
        msg("Sin ISP");
        EmployeeNoISP employeeNoISP = new EmployeeNoISP();
        employeeNoISP.calulatePayment();
        employeeNoISP.generateReport();

        InternNoISP internNoISP = new InternNoISP();
        internNoISP.generateReport();
        internNoISP.calulatePayment();

        //
        msg("Con ISP");
        Employee employee = new Employee();
        employee.calulatePayment();
        employee.generateReport();

        Intern intern = new Intern();
        intern.generateReport();

        //
        msg("Con ISP Tarea");
        Television tv = new Television();
        tv.volumeUp();
        tv.volumeDown();

        SmartTelevision smartTv = new SmartTelevision();
        smartTv.showApps();
        smartTv.volumeUp();
        smartTv.volumeDown();
    }
}
