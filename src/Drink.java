public abstract class Drink extends Item {
    private Item extra1;
    private Item extra2;

    public Drink(String name, String size, double price) {
        super(name, size, price);
    }

    public abstract double getExtraPrice(String toppingName);

    public void addToppings(String extra1, String extra2) {
        this.extra1 = new Item("Topping", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("Topping", extra2, getExtraPrice(extra2));
    }

    @Override
    public double getAdjustedPrice() {
        return super.getBasePrice() +
                (extra1 == null ? 0 : extra1.getAdjustedPrice()) +
                (extra2 == null ? 0 : extra2.getAdjustedPrice()) +
                (switch (super.getSize().toUpperCase()) {
                    case "LARGE" -> 1.0;
                    case "SMALL" -> -0.5;
                    default -> 0;
                });
    }


    public void printItemizedList() {
        printItem(getName(), getBasePrice(), getSize());
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
