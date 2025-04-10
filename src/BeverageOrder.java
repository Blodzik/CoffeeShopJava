import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class BeverageOrder {
    private Coffee coffee;
    private Tea tea;

    private Item side;

    private int quantity = 1;

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

    public void addCoffee(CoffeeType type, String size, int quantity) {
        for(int i = 0; i < quantity; i++) {
            Coffee coffee = new Coffee(type, size);
            drinks.add(coffee);
        }
    }

    public void addTea(TeaType type, String size) {
        Tea tea = new Tea(type, size);
        drinks.add(tea);
    }

    public void addTea(TeaType type, String size, int quantity) {
        for(int i = 0; i < quantity; i++) {
            Tea tea = new Tea(type, size);
            drinks.add(tea);
        }
    }

    public void addSide(SideType type) {
        Item side = new Item(type.name(), "-", type.getPrice());
        sides.add(side);
    }

    public void addSide(SideType type, int quantity) {
        for (int i = 0; i < quantity; i++) {
            Item side = new Item(type.name(), "-", type.getPrice());
            sides.add(side);
        }
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
        Map<String, Integer> itemCounts = new LinkedHashMap<>();
        Map<String, Double> itemPrices = new LinkedHashMap<>();

        for(Drink drink : drinks) {
            String label = drink.getLabel();
            double price = drink.getAdjustedPrice();

            itemCounts.put(label, itemCounts.getOrDefault(label, 0) + 1);
            itemPrices.put(label, price);
        }

        for (Item side : sides) {
            String label = side.getLabel();
            double price = side.getAdjustedPrice();

            itemCounts.put(label, itemCounts.getOrDefault(label, 0) + 1);
            itemPrices.put(label, price);
        }

        double total = 0;

        for (String label : itemCounts.keySet()) {
            int qty = itemCounts.get(label);
            double price = itemPrices.get(label);
            double subtotal = price * qty;
            total += subtotal;

            if (qty > 1) {
                System.out.printf("%s: %.2f x%d = %.2f\n", label, price, qty, subtotal);
            } else {
                System.out.printf("%s: %.2f\n", label, price);
            }
        }

        System.out.println("----------------------------");
        Item.printItem("Total Price", total, "-");
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
