package BankNotifications.NotificationWay;

public class SMSNotification implements NotificationWay {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}