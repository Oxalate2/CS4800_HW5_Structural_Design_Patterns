import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class RestaurantOrderTest {

    @Test
    public void testBurgerCost() {
        double basePrice = 5.0;
        Burger burger = new Burger(basePrice);
        double actualCost = burger.getCost();
        assertEquals(basePrice, actualCost, 0.01);
    }

    @Test
    public void testFriesCost() {
        double basePrice = 2.0;
        Fries fries = new Fries(basePrice);
        double actualCost = fries.getCost();
        assertEquals(basePrice, actualCost, 0.01);
    }

    @Test
    public void testBevCost() {
        double basePrice = 1.0;
        Beverage bev = new Beverage(basePrice);
        double actualCost = bev.getCost();
        assertEquals(basePrice, actualCost, 0.01);
    }

    @Test
    public void testCheeseTopping() {
        double basePrice = 5.0;
        double toppingCost = 1.0;
        Burger burger = new Burger(basePrice);
        Cheese cheese = new Cheese(burger, toppingCost);
        double actualCost = cheese.getCost();
        assertEquals(basePrice + toppingCost, actualCost, 0.01);
    }

    @Test
    public void testChiliTopping() {
        double basePrice = 5.0;
        double toppingCost = 2.75;
        Burger burger = new Burger(basePrice);
        Chili chili = new Chili(burger, toppingCost);
        double actualCost = chili.getCost();
        assertEquals(basePrice + toppingCost, actualCost, 0.01);
    }

    @Test
    public void testOrderTotalCost() {
        List<FoodItem> foodItems = new ArrayList<>();
        double basePrice = 5.0;
        double toppingCost = 1.0;
        Burger burger = new Burger(basePrice);
        Cheese cheese = new Cheese(burger, toppingCost);
        foodItems.add(cheese);

        double basePrice2 = 2.0;
        Fries fries = new Fries(basePrice2);
        foodItems.add(fries);

        double basePrice3 = 1.0;
        Beverage bev = new Beverage(basePrice3);
        foodItems.add(bev);

        Order order = new Order();

        double actualCost = order.calcTotalCost();
        double expectedCost = basePrice + toppingCost + basePrice2 + basePrice3;
        assertEquals(expectedCost, actualCost, 0.01);
    }

    @Test
    public void testLoyaltyDiscount() {
        double basePrice = 5.0;
        double toppingCost = 1.0;
        Burger burger = new Burger(basePrice);
        Cheese cheese = new Cheese(burger, toppingCost);

        double basePrice2 = 2.0;
        Fries fries = new Fries(basePrice2);

        double basePrice3 = 1.0;
        Beverage bev = new Beverage(basePrice3);

        List<FoodItem> foodItems = new ArrayList<>();
        foodItems.add(cheese);
        foodItems.add(fries);
        foodItems.add(bev);

        Order order = new Order();
    }
}