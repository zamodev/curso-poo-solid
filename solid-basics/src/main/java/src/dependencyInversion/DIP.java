package src.dependencyInversion;

import src.dependencyInversion.example.dip.DataService;
import src.dependencyInversion.example.dip.Repository;
import src.dependencyInversion.example.dip.RepositoryFirebase;
import src.dependencyInversion.example.dip.RepositorySQL;
import src.dependencyInversion.example.nodip.DataServiceNoDIP;
import src.dependencyInversion.example.nodip.RepositoryFirebaseLNoDIP;
import src.dependencyInversion.example.nodip.RepositorySQLNoDIP;
import src.dependencyInversion.practice.srp.MessengerSMS;
import src.dependencyInversion.practice.srp.MessengerService;
import src.dependencyInversion.practice.srp.MessengerWatsap;
import src.utils.Utils;

public class DIP extends Utils {
    public static void main(String[] args) {
        msg("Sin DIP");
        RepositorySQLNoDIP repository = new RepositorySQLNoDIP();
        RepositoryFirebaseLNoDIP repositoryFirebase = new RepositoryFirebaseLNoDIP();
        DataServiceNoDIP dataService = new DataServiceNoDIP(repository);
      //no funciona ->  DataServiceNoDIP dataService = new DataServiceNoDIP(repositoryFirebase);
        dataService.saveData("Insertar tabla :v");

        //
        msg("Con DIP");
        Repository repositoryDIP = new RepositorySQL();
        DataService dataServ = new DataService(repositoryDIP);
        dataServ.saveData("Insertar tabla con DIP");
        repositoryDIP = new RepositoryFirebase();
        DataService dataServFirebase = new DataService(repositoryDIP);
        dataServFirebase.saveData("Insertar tabla con Firebase y DIP");
        //
        msg("Tarea con DIP");
        MessengerSMS messengerSMS = new MessengerSMS();
        MessengerService messengerService = new MessengerService(messengerSMS);
        messengerService.send("Hola, este es un mensaje de prueba usando DIP");

        MessengerWatsap messengerWatsap = new MessengerWatsap();
        MessengerService messengerServiceWatsap = new MessengerService(messengerWatsap);
        messengerServiceWatsap.send("Hola, este es un mensaje de prueba usando DIP con WhatsApp");
    }
}
