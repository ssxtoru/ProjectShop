public interface AltaiProduct {
    void displayInfo();
    double calculateShippingCost(double distance);

    boolean isFreeShipping(double distance);

    double DiscountPrice(double DiscountPercentage);
    void applyAdditionalDiscount(double extraDiscount);
}
