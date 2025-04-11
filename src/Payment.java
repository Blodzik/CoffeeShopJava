public abstract class Payment {
    private double amountDue;

    public Payment(double amountDue) {
        this.amountDue = amountDue;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public abstract boolean process();
}
