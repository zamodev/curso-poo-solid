package src.dependencyInversion.example.nodip;

public class RepositorySQLNoDIP {
    public void save(String data) {
        System.out.println("Guardando en SQL: " + data);
    }
}
