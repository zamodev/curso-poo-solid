package src.liskovSubstitution;

import src.liskovSubstitution.example.nolsp.PentagonoNoSLP;
import src.liskovSubstitution.example.nolsp.RectangleNoSLP;
import src.liskovSubstitution.example.lsp.Rectangle;
import src.liskovSubstitution.example.lsp.Square;
import src.liskovSubstitution.example.lsp.alt.Bicycle;
import src.liskovSubstitution.example.lsp.alt.Car;
import src.liskovSubstitution.example.lsp.alt.Transport;
import src.liskovSubstitution.practice.lsp.EmailNotification;
import src.liskovSubstitution.practice.lsp.Notification;
import src.liskovSubstitution.practice.lsp.SMSNotification;
import src.liskovSubstitution.practice.nolsp.NotificationEmailNoLSP;
import src.liskovSubstitution.practice.nolsp.NotificationSMSNoLSP;
import src.utils.Utils;

public class LSP extends Utils {
    public static void main(String[] args) {
        msg("Sin LSP");
        RectangleNoSLP rectangleNoSLP = new RectangleNoSLP();
        rectangleNoSLP.setWidth(20);
        rectangleNoSLP.setHeight(10);
        msg("Area  del rectangulo: " + rectangleNoSLP.getArea());
        PentagonoNoSLP pentagonoNoSLP = new PentagonoNoSLP();
        pentagonoNoSLP.setMeasurement(5);
        msg("Area del pentagono: " + pentagonoNoSLP.getArea());
        //
        msg("Con LSP");
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        msg("Area del rectangulo: " + rectangle.getArea());

        rectangle = new Square();
        rectangle.setHeight(20);
        msg("Area del cuadrado: " + rectangle.getArea());
        ///
        msg("Ejemplo alternativo de LSP");
        Transport transport = new Bicycle();
        transport = new Car();
        transport.move();
        //
        msg("Tarea de LSP");
        msg("Sin LSP");

        NotificationEmailNoLSP notificationEmailNoLSP = new NotificationEmailNoLSP();
        notificationEmailNoLSP.send("Aviso para el dia lunes....");
        // Esto falla -> //notificationEmailNoLSP = new NotificationSMSNoLSP();

        //
        msg("Solucion tarea LSP");
        Notification notification = new EmailNotification();
        notification.send("Aviso para el dia lunes....");
        notification = new SMSNotification();
        notification.send("Aviso para el dia martes....");

    }
}
