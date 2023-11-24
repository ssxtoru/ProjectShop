public class ClothingProduct implements AltaiProduct {

    private String brand;
    private double price;
    private String typeOfCloth;

    private double nikeDiscount = 10.00;

    public ClothingProduct(String brand, double price, String typeOfCloth) {
        this.price = price;
        this.brand = brand;
        this.typeOfCloth = typeOfCloth;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing Product Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Type of Clothing: " + typeOfCloth);
        System.out.println("Price: $" + price);
    }

    @Override
    public double calculateShippingCost(double distance) {
        return 0.15 * distance;
    }

    @Override
    public boolean isFreeShipping(double distance) {
        return distance < 20;
    }

    @Override
    public double DiscountPrice(double discountPercentage) {
        if (brand.equalsIgnoreCase("nike")) {
            double discount = price * (nikeDiscount / 100);
            return price - discount;

        }
        return price;
    }


    @Override
    public void applyAdditionalDiscount(double extraDiscount) {

    }
}
