public class Burger implements FoodItem {
    private double basePrice;

    public Burger(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getCost() {
        return basePrice;
    }
}
