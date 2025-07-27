package src.dependencyInversion.example.dip;

public class DataService {
    private Repository repository;

    // Esto hace que la clase DataService dependa de la abstracción Repository,
    public DataService(Repository repository) {
        this.repository = repository;
    }

    public void saveData(String data) {
        repository.save(data);
    }
}
