public class Route {
    protected String pickUpAddress;
    protected String destinationAddress;
    protected double tripPrice;

    //constructor
    public Route(String pickUpAddress, String destinationAddress, double tripPrice) throws IllegalArgumentException{
        if (tripPrice < 0) throw new IllegalArgumentException("Trip Price must be positive");
        this.pickUpAddress = pickUpAddress;
        this.destinationAddress = destinationAddress;
        this.tripPrice = tripPrice;
    }

    //Extra methods
    @Override
    public String toString() {
        return pickUpAddress + " → " + destinationAddress + " ("  + tripPrice + " SR)";
    }
}
