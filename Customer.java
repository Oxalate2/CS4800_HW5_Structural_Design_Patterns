public class Customer {
    private String name;
    private LoyaltyStatus loyaltyStatus;
    public Customer(String name, LoyaltyStatus loyaltyStatus) {
        this.name = name;
        this.loyaltyStatus = loyaltyStatus;
    }

    public LoyaltyStatus getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }
}
