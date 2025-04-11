public class Discount {
    public static final double PREMIUM_SERVICE_DISCOUNT = 0.20;
    public static final double GOLD_SERVICE_DISCOUNT = 0.15;
    public static final double SILVER_SERVICE_DISCOUNT = 0.10;
    public static final double NO_DISCOUNT = 0.0;
    public static final double PRODUCT_DISCOUNT = 0.10;
    public static double getServiceDiscount(Customer.MembershipType membership) {
        switch (membership) {
            case PREMIUM:
                return PREMIUM_SERVICE_DISCOUNT;
            case GOLD:
                return GOLD_SERVICE_DISCOUNT;
            case SILVER:
                return SILVER_SERVICE_DISCOUNT;
            default:
                return NO_DISCOUNT;
        }
    }
    public static double getProductDiscount() {
        return PRODUCT_DISCOUNT;
    }
}
