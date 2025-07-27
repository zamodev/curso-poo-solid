package src.dependencyInversion.example.dip;

public class RepositorySQL implements  Repository{
    @Override
    public void save(String data) {
        System.out.println("Guardando en SQL: " + data);
    }
}
