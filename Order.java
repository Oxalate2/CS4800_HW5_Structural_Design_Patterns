import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> items = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        items.add(foodItem);
    }

    public double calcTotalCost() {
        double totalCost = 0.0;
        for (FoodItem item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}
