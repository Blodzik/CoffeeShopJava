public enum CoffeeType {
    ESPRESSO(2.0),
    DOPIO(3.0),
    CAPPUCCINO(3.5),
    LATTE(4.0),
    BLACK_COFFE(2.5),
    WHITE_COFFE(3.0),
    ESPRESO_MACHIATO(2.5),
    FLATWHITE(4.0);

    private final double price;

    CoffeeType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
