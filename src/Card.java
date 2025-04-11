public class Card {
    private String cardNumber;
    private double balance;

    public Card(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public boolean charge(double amount) {
        if (amount < balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
