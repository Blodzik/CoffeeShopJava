public class Coffee extends Drink {
    private Item extra1;
    private Item extra2;
    private CoffeeType type;

    public Coffee(CoffeeType type, String size) {
        super(type.name(), size, type.getPrice());
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() + " Coffee";
    }

    public double getExtraPrice(String toppingName) {
        return switch(toppingName.toUpperCase()) {
            case "MILK", "SUGAR" -> 0.5;
            case "LACTOSE-FREE MILK", "BROWN SUGAR", "ESPRESSO" -> 1.0;
            default -> 0;
        };
    }
}
