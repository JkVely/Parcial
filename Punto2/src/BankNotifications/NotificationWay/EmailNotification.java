package BankNotifications.NotificationWay;

public class EmailNotification implements NotificationWay {
    @Override
    public void sendNotification(String message) {
        System.out.println("Enviando correo electrónico: " + message);
    }
}