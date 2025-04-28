package BankNotifications.NotificationContent;

public class Promotions implements NotificationContent {
    private String promotionDetails;

    public Promotions(String promotionDetails) {
        this.promotionDetails = promotionDetails;
    }

    @Override
    public String sendMessage() {
        return "Promotion: " + promotionDetails;
    }
}
