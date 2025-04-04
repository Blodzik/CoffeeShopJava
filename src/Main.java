//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder(CoffeeType.LATTE, "Large", SideType.APPLE_PIE);
        order1.addCoffeeTopings("Sugar", "");
        order1.printItemizedCoffeeList();

        CoffeeOrder order2 = new CoffeeOrder(CoffeeType.DOPIO, "Medium", SideType.CROISSANT);
        order2.addCoffeeTopings("Brown Sugar", "");
        order2.printItemizedCoffeeList();


       CoffeeOrder order3 = new CoffeeOrder(TeaType.BLACK_TEA, "Medium", SideType.APPLE_PIE);
       order3.addTeaToppings("LEMON", "HONEY");
       order3.printItemizedTeaList();
    }
}