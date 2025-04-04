public class Tea extends Drink{
    private Item extra1;
    private Item extra2;
    private TeaType type;

    public Tea(TeaType type, String size) {
        super(type.name(), size, type.getPrice());
        this.type = type;
    }

    @Override
    public String getName() {
        return super.getName() + " Tea";
    }

    public double getExtraPrice(String toppingName) {
        return switch(toppingName.toUpperCase()) {
            case "MILK", "SUGAR", "LEMON" -> 0.5;
            case "GINGER", "HONEY", "CINAMON" -> 1;
            default -> 0;
        };
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        Item.printItem("Total " + getName(), getAdjustedPrice());
    }
}
