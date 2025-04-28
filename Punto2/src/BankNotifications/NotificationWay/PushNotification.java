package BankNotifications.NotificationWay;

public class PushNotification implements NotificationWay {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando notificación push: " + message);
    }
}