package src.singleResponsibility;

import src.singleResponsibility.example.nosrp.EmployeeNoSRP;
import src.singleResponsibility.example.srp.EmployeeSRP;
import src.singleResponsibility.example.srp.Reports;
import src.singleResponsibility.practice.nosrp.UserNoSRP;
import src.singleResponsibility.practice.srp.UserService;
import src.utils.Utils;

public class SRP extends Utils {
    public static void main(String[] args){
        msg("Sin SRP");
        EmployeeNoSRP employeeNoSRP = new EmployeeNoSRP("Juan", "Desarrollador");
        employeeNoSRP.generateReport();
        //--------------
        msg("Con SRP");
        EmployeeSRP employeeSRP = new EmployeeSRP("Juan", "Empresario"); // Instancia de empleado
        Reports reports = new Reports(); //Instnacia para generar reportes
        reports.generateReport(employeeSRP); // Genera el reporte de un empleado
        //--------------
        msg("Practica SRP");
        msg("Sin SRP");
        UserNoSRP userNoSRP = new UserNoSRP();
        userNoSRP.crateUser("Juanito", "juanito@mail.com");
        // --------------
        msg("Practica Con SRP");
        UserService userService = new UserService();
        userService.crateUser("Pruebita", "Pruebita@gmail.com");
    }
}
