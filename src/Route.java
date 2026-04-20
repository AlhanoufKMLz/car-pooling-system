public class Route {
    protected String pickUpAddress;
    protected String destinationAddress;
    protected double tripPrice;

    //constructor
    public Route(String pickUpAddress, String destinationAddress, double tripPrice) {
        this.pickUpAddress = pickUpAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }
}
