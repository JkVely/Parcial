package BankNotifications.NotificationContent;

public class TransactionNotification implements NotificationContent {
    private String transactionId;
    private String accountNumber;
    private double amount;

    public TransactionNotification(String transactionId, String accountNumber, double amount) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public String sendMessage() {
        return "Transaction ID: " + transactionId + ", Account Number: " + accountNumber + ", Amount: " + amount;
    }

}
