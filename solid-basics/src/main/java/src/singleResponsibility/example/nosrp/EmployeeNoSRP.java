package src.singleResponsibility.example.nosrp;

public class EmployeeNoSRP {
    private String nombre;
    private String role;

    public EmployeeNoSRP(String nombre, String role) {
        this.nombre = nombre;
        this.role = role;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void generateReport(){
        System.out.println("Generando reporte de:" + role + " " + nombre);
    }
}
