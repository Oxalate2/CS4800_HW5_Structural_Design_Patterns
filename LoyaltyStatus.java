import java.text.DecimalFormat;

public class LoyaltyStatus {
    private double discount; // percentage discount

    public LoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double totalCost) {
        double postCost = totalCost * (1 - discount);
        // Format 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedValue = df.format(postCost);
        return Double.parseDouble(formattedValue);
    }
}

