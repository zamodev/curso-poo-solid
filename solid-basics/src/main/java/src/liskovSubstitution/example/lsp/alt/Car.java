package src.liskovSubstitution.example.lsp.alt;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("Moviendose en automovil");
    }
}
