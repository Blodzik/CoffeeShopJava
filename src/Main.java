//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Coffee coffee = new Coffee("Espresso","Large", 1.5);
//        coffee.addToppings("Sugar", "Milk");
//        coffee.printItem();

        CoffeeOrder coffeeOrder = new CoffeeOrder("Espresso", "Medium", "Apple Pie");
        coffeeOrder.addCoffeeTopings("Milk", "Brown Sugar");
        coffeeOrder.printItemizedList();


    }
}