public class NonSubscribers extends Passenger{
    private boolean discount;

    //constructor
    public NonSubscribers(String name, String id, boolean discount) {
        super(name, id);
        this.discount = discount;
    }


    //getter and setter
    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }


    //methods
    @Override
    public void reserveCar(Car car) throws Exception{
        if(car.isFull()) throw new Exception("This car is full!");

        super.setReservedCar(car);
        car.maxCapacity--;
        super.setTripCost( discount ? car.route.tripPrice - (car.route.tripPrice * 0.1) : car.route.tripPrice );
    }

    @Override
    public void displayInfo() throws Exception{
        if(super.hasNoReservation()) throw new Exception("The passenger " + super.getName() + " has no reservation!");

        System.out.println( super.getReservedCar().route + "\n" +
                            "   * Passenger Name: " + super.getName() + "\n" +
                            "   * Passenger Id: " + super.getId() + "\n" +
                            "   * Passenger Type: Non-Subscriber \n" +
                            "   * Reserved Car Code: " + super.getReservedCar().code + "\n" +
                            "   * Route Price: " + (discount ? "\u001B[9m" + (super.getReservedCar().route.tripPrice) + "SR\u001B[0m " : "" )+ super.getTripCost() + "SR");
    }
}
