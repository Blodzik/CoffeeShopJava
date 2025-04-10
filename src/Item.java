public class Item {
    private String name;
    private String size;
    private double price;


    public Item(String name, String size, double price) {
        this.name = name.toUpperCase();
        this.size = size.toUpperCase();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size.toUpperCase();
    }

    public static void printItem(String name, double price, String size) {
        System.out.printf("%10s (%s): %6.2f%n", name, size, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice(), getSize());
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return name;
    }

    public String getLabel() {
        return String.format("%s (%s)", name, size);
    }


}
