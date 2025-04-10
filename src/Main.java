//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BeverageOrder order1 = new BeverageOrder(CoffeeType.LATTE, "Small", SideType.APPLE_PIE);
        order1.addCoffeeTopings("Sugar", "");
        order1.printItemizedCoffeeList();

        BeverageOrder order2 = new BeverageOrder(CoffeeType.DOPPIO, "Medium", SideType.CROISSANT);
        order2.addCoffeeTopings("Brown Sugar", "");
        order2.printItemizedCoffeeList();

        BeverageOrder order3 = new BeverageOrder(TeaType.BLACK_TEA, "Medium", SideType.APPLE_PIE);
        order3.addTeaToppings("LEMON", "HONEY");
        order3.printItemizedTeaList();

       Item item = new Item("name", "small", 4.5);

       Order order = new Order();
       order.addBeverageOrder(order1);
       order.addBeverageOrder(order2);
       order.printSummary();

       BeverageOrder order5 = new BeverageOrder();
       order5.addCoffee(CoffeeType.DOPPIO,  "small", 2);
       //order5.addCoffeeTopings("Sugar", "Milk");
       order5.addCoffee(CoffeeType.LATTE, "large", 3);
       order5.addTea(TeaType.BLACK_TEA, "small");
       //order5.addTeaToppings("LEMON", "HONEY");
       order5.addSide(SideType.APPLE_PIE, 2);
       order5.printItemizedOrder();
    }
}