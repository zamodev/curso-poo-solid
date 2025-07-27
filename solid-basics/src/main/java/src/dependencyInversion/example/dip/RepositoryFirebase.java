package src.dependencyInversion.example.dip;

public class RepositoryFirebase implements Repository{
    @Override
    public void save(String data) {
        System.out.println("Guardando en Firebase: " + data);
    }
}
