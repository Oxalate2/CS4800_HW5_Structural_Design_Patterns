public class RestaurantOrder {
    public static void main(String[] args) {
        // Make food items including base prices
        FoodItem fries = new Fries(4.25);
        FoodItem burger = new Burger(8.50);
        FoodItem bev = new Beverage(2.00);

        // Toppings added to food items
        // Lettuce cheeseburger
        FoodItem cheeseBurger = new Cheese(burger, 1.0);
        FoodItem lettuceBurger = new Lettuce(burger, 0.5);
        FoodItem lettuceCheeseBurger = new Lettuce(cheeseBurger, 1.25);
        // Beverage with boba
        FoodItem bobaBev = new Boba(bev, 0.75);
        // Chili cheese fries
        FoodItem cheeseFries = new Cheese(fries, 1.0);
        FoodItem chiliCheeseFries = new Chili(cheeseFries, 2.75);

        // Order creation
        Order order = new Order();
        order.addFoodItem(lettuceCheeseBurger);
        order.addFoodItem(bobaBev);
        order.addFoodItem(chiliCheeseFries);

        // Total Cost Calculation
        double totalCost = order.calcTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Loyalty Discount
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.15); // 15% discount
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after discount: $" + discountedCost);
    }
}