public class Chili extends ToppingDecorator {
    private double cost;

    public Chili(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + cost;
    }
}
