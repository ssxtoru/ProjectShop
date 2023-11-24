public interface Product {
    void displayInfo();
    double calculateShippingCost(double distance, int serialNumber);
    default void isNotFreeShipping(){
        System.out.println("\nSorry we don't have free shipping for Electronic products!");
    }
    double discountPrice(double priceWithShipping);


}
