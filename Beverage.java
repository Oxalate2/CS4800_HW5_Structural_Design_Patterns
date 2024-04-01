public class Beverage implements FoodItem {
    private double basePrice;

    public Beverage(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost() {
        return basePrice;
    }
}