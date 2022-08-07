public class DiscountCalculationService {

    private static final double DEFAULT_DISCOUNT = 0.05;
    public double calculateDiscount(double price) {
        return price * DEFAULT_DISCOUNT;
    }
}
