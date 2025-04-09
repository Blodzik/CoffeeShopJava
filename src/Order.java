import java.util.List;
import java.util.ArrayList;
public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void addCoffeeOrder(CoffeeOrder coffeeOrder) {
        items.add(coffeeOrder.getCoffee());
        items.add(coffeeOrder.getSide());
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printSummary() {
        System.out.println("\n========= ORDER SUMMARY =========");
        System.out.printf("%-20s %-10s %10s%n", "Item", "Size", "Price");
        System.out.println("--------------------------------------------");

        for (Item item : items) {
            System.out.printf("%-20s %-10s $%9.2f%n",
                    item.getDescription(),
                    item.getSize(),
                    item.getAdjustedPrice());
        }

        System.out.println("--------------------------------------------");
        System.out.printf("%-30s $%9.2f%n", "TOTAL:", getTotalPrice());
        System.out.println("============================================\n");
    }
}
