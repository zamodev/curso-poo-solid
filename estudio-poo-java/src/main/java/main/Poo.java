package main;

import abstraction.BasicPhone;
import abstraction.Phone;
import abstraction.SonPhone;
import encapsulation.Citizen;
import inheritance.NaturalCitizen;
import polimorphism.SmartPhone;

public class Poo {
    public static void main(String[] args) {
        // Ejemplo de encapsulación y uso de clases en Java
        Person person = new Person(); //Instacia de la clase Person
        person.name = "John Doe"; //Asignación de un valor al atributo name
        person.introduce(); //Llamada al método introduce de la clase Person

        // Ejemplo de encapsulación
        Citizen citizen = new Citizen("Jane Doe", "1990-01-01", 1234);
        citizen.setName("Pepita");
        System.out.println("Nombre del ciudadano: " + citizen.getName());
        System.out.println(citizen.getBirhdate(1234));

        // EJemplo Herencia
        NaturalCitizen naturalCitizen = new NaturalCitizen("Juan Perez", "1995-05-05", 5678, "Colombia");
        naturalCitizen.setCountryOrigin("Mexico");
        naturalCitizen.getName();
        System.out.println("Nombre del ciudadano natural: " + naturalCitizen.getName());
        System.out.println("País de origen: " + naturalCitizen.getCountryOrigin());

        //Ejemplo de abstracción
        BasicPhone basicPhone = new BasicPhone();
        basicPhone.dial();
        basicPhone.callMom();
        SonPhone sonPhone = new BasicPhone(); //BasicPhone implementa SonPhone
        sonPhone.callMom();

        // Ejemplo de polimorfismo
        callPhone(basicPhone); // Llamada al metodo callPhone con un objeto de tipo BasicPhone.
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.dial();
        callPhone(smartPhone); // Llamada al metodo callPhone con un objeto de tipo SmartPhone.
    }

    //BasicPhone como SmartPhone heredan de Phone, por lo que pueden ser pasados como argumento.
    private static void callPhone(Phone phone) {
        phone.call();
    }


}
