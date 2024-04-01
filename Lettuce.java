public class Lettuce extends ToppingDecorator {
    private double price;

    public Lettuce(FoodItem foodItem, double cost) {
        super(foodItem);
        this.price = price;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + price;
    }
}
