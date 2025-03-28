public class CoffeeOrder {
    private Coffee coffee;

    private Item side;

    public CoffeeOrder(CoffeeType coffeeType, String size, SideType sideType) {
        this.coffee = new Coffee(coffeeType, size);
        this.side = new Item(sideType.name(), "-", sideType.getPrice());
    }

    public double getTotalPrice() {
        return coffee.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        coffee.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());
        System.out.println("-".repeat(30));
    }

    public void addCoffeeTopings(String extra1, String extra2) {
        coffee.addToppings(extra1, extra2);
    }

    public void setCoffeeSize(String size) {
        coffee.setSize(size);
    }

}
