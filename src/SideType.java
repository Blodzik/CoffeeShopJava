public enum SideType {
    MUFFIN(2.50),
    APPLE_PIE(3.00),
    CHEESECAKE(4.00),
    CROISSANT(2.75),
    CINNAMON_ROLL(3.50),
    CHOCOLATE_BROWNIE(3.25),
    DONUT(2.00),
    BANANA_BREAD(3.75),
    MACARON(4.50),
    SCONE(3.25);

    private final double price;

    SideType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
