public class CoffeeOrder {
    private Coffee coffee;
    private Tea tea;

    private Item side;

    public CoffeeOrder(CoffeeType coffeeType, String size, SideType sideType) {
        this.coffee = new Coffee(coffeeType, size);
        this.side = new Item(sideType.name(), "-", sideType.getPrice());
    }

    public CoffeeOrder(TeaType teaType, String size, SideType sideType) {
        this.tea = new Tea(teaType, size);
        this.side = new Item(sideType.name(), "-", sideType.getPrice());
    }

    public double getTotalCoffeePrice() {
        return coffee.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public double getTotalTeaPrice() {
        return tea.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedCoffeeList() {
        coffee.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalCoffeePrice());
        System.out.println("-".repeat(30));
    }

    public void printItemizedTeaList() {
        tea.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", getTotalTeaPrice());
        System.out.println("-".repeat(30));
    }

    public void addCoffeeTopings(String extra1, String extra2) {
        coffee.addToppings(extra1, extra2);
    }

    public void addTeaToppings(String extra1, String extra2) {
        tea.addToppings(extra1, extra2);
    }

    public void setCoffeeSize(String size) {
        coffee.setSize(size);
    }

    public void setTeaSize(String size) {
        tea.setSize(size);
    }

}
