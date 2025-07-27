package abstraction;

public abstract class Phone {
    //Cualquier funcion marcada como abstracta debe ser implementada en las clases que heredan de Phone
    public abstract void dial();


    //Metodo concreto que no es abstracto
    public void call() {
        System.out.println("Calling a.. ");
    }
}
