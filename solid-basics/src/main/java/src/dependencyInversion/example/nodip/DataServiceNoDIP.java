package src.dependencyInversion.example.nodip;

public class DataServiceNoDIP {
    private RepositorySQLNoDIP repository;

    //Esto hace que la clase DataServiceNoDIP dependa directamente de RepositorySQLNoDIP,
    public DataServiceNoDIP(RepositorySQLNoDIP repository) {
        this.repository = repository;
    }

    public void saveData(String data) {
        repository.save(data);
    }

}
