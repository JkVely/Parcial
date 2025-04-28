package BankNotifications;

import BankNotifications.NotificationContent.NotificationContent;
import BankNotifications.NotificationWay.NotificationWay;

public interface Notification {
    public void notify(NotificationContent content, NotificationWay notificationWay);
}
