public class Coffee extends Item {
    private Item extra1;
    private Item extra2;
    private CoffeeType type;

    public Coffee(CoffeeType type, String size) {
        super(type.name(), size, type.getPrice());
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() + " Coffee";
    }

    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() +
                (extra1 == null ? 0 : extra1.getAdjustedPrice()) +
                (extra2 == null ? 0 : extra2.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch(toppingName.toUpperCase()) {
            case "MILK", "SUGAR" -> 0.5;
            case "LACTOSE-FREE MILK", "BROWN SUGAR", "ESPRESSO" -> 1.0;
            default -> 0;
        };
    }

    public void addToppings(String extra1, String extra2) {
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
    }

    public void printItemizedList() {
        printItem(getName(), getBasePrice());
        if(extra1 != null) {
            extra1.printItem();
        }

        if(extra2 != null) {
            extra2.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

}
