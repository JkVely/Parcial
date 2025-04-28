package BankNotifications;

import BankNotifications.NotificationContent.*;
import BankNotifications.NotificationWay.*;

public class App {
    public static void main(String[] args) {
        Promotions promo = new Promotions("50% off on all products!");
        NotificationWay smsNotify = new SMSNotification();
        smsNotify.sendNotification(promo.sendMessage());
        NotificationWay emailNotify = new EmailNotification();
        emailNotify.sendNotification(promo.sendMessage());
        Alert alert = new Alert("Your account balance is low!");
        emailNotify.sendNotification(alert.sendMessage());
    }
}
