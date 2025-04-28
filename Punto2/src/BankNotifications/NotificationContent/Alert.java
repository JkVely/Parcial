package BankNotifications.NotificationContent;

public class Alert implements NotificationContent {
    private String alertMessage;

    public Alert(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    @Override
    public String sendMessage() {
        return "Alert: " + alertMessage;
    }
}
