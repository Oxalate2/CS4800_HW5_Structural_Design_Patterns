public class Cheese extends ToppingDecorator {
    private double price;

    public Cheese(FoodItem foodItem, double price) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + price;
    }
}
