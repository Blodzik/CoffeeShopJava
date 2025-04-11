public class CashPayment extends Payment {
    private double cashReceived;

    public CashPayment(double amountDue, double cashReceived) {
        super(amountDue);
        this.cashReceived = cashReceived;
    }

    @Override
    public boolean process() {
        if (cashReceived < getAmountDue()) {
            System.out.println("❌ Insufficient cash. Payment failed.");
            return false;
        } else {
            double change = cashReceived - getAmountDue();
            System.out.printf("✅ Payment successful. Change: %.2f\n", change);
            return true;
        }
    }
}
