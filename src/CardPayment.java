public class CardPayment extends Payment {
    private Card card;

    public CardPayment(double amountDue, Card card) {
        super(amountDue);
        this.card = card;
    }

    @Override
    public boolean process() {
        if (card.charge(getAmountDue())) {
            System.out.println("✅ Card payment successful.");
            return true;
        } else {
            System.out.println("❌ Card declined. Not enough balance.");
            return false;
        }
    }
}
