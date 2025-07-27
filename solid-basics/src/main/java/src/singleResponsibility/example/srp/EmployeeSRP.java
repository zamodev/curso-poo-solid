package src.singleResponsibility.example.srp;

public class EmployeeSRP {
    private String nombre;
    private String role;

    public EmployeeSRP(String nombre, String role) {
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

}
