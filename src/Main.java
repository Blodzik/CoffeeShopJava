//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Large", 1.5);
        coffee.addToppings("Sugar", "Milk");

        coffee.printItem();
    }
}