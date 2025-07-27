package src.dependencyInversion.example.nodip;

public class RepositoryFirebaseLNoDIP {
    public void save(String data) {
        System.out.println("Guardando en FireStore " + data);
    }
}
