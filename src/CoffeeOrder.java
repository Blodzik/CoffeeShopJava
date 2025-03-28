public class CoffeeOrder {
    private Coffee coffee;
    private Item side;

    public CoffeeOrder() {
        this("regular", "medium", "none");
    }

    public CoffeeOrder(String name, String size, String side) {
        this.coffee = new Coffee(name, size,2.5);
        this.side = new Item("Apple Pie", "Medium", 4.0);
    }

    public double getTotalPrice() {
        return coffee.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        coffee.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalPrice());
    }

    public void addCoffeeTopings(String extra1, String extra2) {
        coffee.addToppings(extra1, extra2);
    }

    public void setCoffeSize(String size) {
        coffee.setSize(size);
    }

}
