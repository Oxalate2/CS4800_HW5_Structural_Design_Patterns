public class Boba extends ToppingDecorator {
    private double cost;

    public Boba(FoodItem foodItem, double cost) {
        super(foodItem);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + cost;
    }
}
