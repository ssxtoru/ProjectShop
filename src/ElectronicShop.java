public class ElectronicShop implements Product{

    private double iphone15pro;
    private double macBookAir;
    private double airPodsPro;
    private double iPad;

    public ElectronicShop(double iphone15pro, double macBookAir, double airPodsPro, double iPad) {
        this.iphone15pro = iphone15pro;
        this.macBookAir = macBookAir;
        this.airPodsPro = airPodsPro;
        this.iPad = iPad;
    }

    @Override
    public void displayInfo() {
        System.out.print("\nWelcome to the Electronic Shop!" +
                "\nHere is the price list of our products:" +
                "\n1.Iphone 15 pro 256 gb - " + iphone15pro +
                "\n2.MacBook Air 512 - " + macBookAir +
                "\n3.Airpods Pro - " + airPodsPro +
                "\n4.IPad 256- " + iPad +
                "\nIf you'd like to order smth from the list, put the serial number of the product:");
    }

    @Override
    public double calculateShippingCost(double distance, int serialNumber) {
        switch (serialNumber) {
            case 1:
                return iphone15pro + (distance / 100);
            case 2:
                return macBookAir + (distance / 100);
            case 3:
                return airPodsPro + (distance / 100);
            case 4:
                return iPad + (distance / 100);
            default:
                return 0;
        }
    }


    @Override
    public double discountPrice(double priceWithShipping) {
        return priceWithShipping - (priceWithShipping / 100 * 10);
    }
}
