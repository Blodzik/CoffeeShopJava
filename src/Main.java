//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.LATTE, "Large", SideType.APPLE_PIE);
        order1.addCoffeeTopings("Sugar", "");
        order1.printItemizedList();

        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.DOPIO, "Medium", SideType.CROISSANT);
        order2.addCoffeeTopings("Brown Sugar", "");
        order2.printItemizedList();
    }
}