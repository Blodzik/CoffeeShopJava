import java.util.ArrayList;
import java.util.List;

public class BeverageOrder {
    private Coffee coffee;
    private Tea tea;

    private Item side;

    private List<Drink> drinks;
    private List<Item> sides;

    public BeverageOrder() {
        this.drinks = new ArrayList<>();
        this.sides = new ArrayList<>();
    }

    public BeverageOrder(CoffeeType coffeeType, String size, SideType sideType) {
        this.coffee = new Coffee(coffeeType, size);
        this.side = new Item(sideType.name(), "-", sideType.getPrice());
    }

    public BeverageOrder(TeaType teaType, String size, SideType sideType) {
        this.tea = new Tea(teaType, size);
        this.side = new Item(sideType.name(), "-", sideType.getPrice());
    }

    public void addCoffee(CoffeeType type, String size) {
        Coffee coffee = new Coffee(type, size);
        drinks.add(coffee);
    }

    public void addTea(TeaType type, String size) {
        Tea tea = new Tea(type, size);
        drinks.add(tea);
    }

    public void addSide(SideType type) {
        Item side = new Item(type.name(), "-", type.getPrice());
        sides.add(side);
    }

    public double getTotalCoffeePrice() {
        return coffee.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public double getTotalTeaPrice() {
        return tea.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        for (Item item : sides) {
            total += item.getPrice();
        }
        return total;
    }

    public void printItemizedList(Item drink, double totalPrice, String size) {
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("Total Price", totalPrice, size);
        System.out.println("-".repeat(30));
    }

    public void printItemizedOrder() {
        System.out.println("\n========= ORDER =========");
        for (Drink drink : drinks) {
            drink.printItem();
        }
        for (Item side : sides) {
            side.printItem();
        }
        System.out.println("----------------------------");
        Item.printItem("Total Price", getTotalPrice(), "-");
        System.out.println("============================\n");
    }

    public void printItemizedCoffeeList() {
        printItemizedList(coffee, getTotalCoffeePrice(), coffee.getSize());
    }

    public void printItemizedTeaList() {
        printItemizedList(tea, getTotalTeaPrice(), tea.getSize());
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

    public Coffee getCoffee() {
        return coffee;
    }

    public Tea getTea() {
        return tea;
    }

    public Item getSide() {
        return side;
    }

}
