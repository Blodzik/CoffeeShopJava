public enum TeaType {
    BLACK_TEA(2.0),
    GREEN_TEA(2.5),
    OOLONG_TEA(3.0),
    WHITE_TEA(3.5),
    HERBAL_TEA(3.0),
    MATCHA(4.0),
    CHAI_TEA(3.5),
    EARL_GREY(3.0),
    PEPPERMINT_TEA(2.5),
    ROOIBOS_TEA(3.0);

    private final double price;

    TeaType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
