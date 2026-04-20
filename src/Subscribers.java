public class Subscribers extends Passenger {

    //constructor
    public Subscribers(String name, String id) {
        super(name, id);
    }


    //methods
    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.isFull()) throw new Exception("Sorry.. this car is full!");

        super.setReservedCar(car);
        car.maxCapacity--;
        super.setTripCost(car.route.tripPrice * 0.5);
    }

    @Override
    public void displayInfo() throws Exception {
        if (super.hasNoReservation()) throw new Exception("The passenger " + super.getName() + " has no reservation!");

        System.out.println(super.getReservedCar().route + "\n" +
                "   * Passenger Name: " + super.getName() + "\n" +
                "   * Passenger Id: " + super.getId() + "\n" +
                "   * Passenger Type: Subscriber \n" +
                "   * Reserved Car Code: " + super.getReservedCar().code + "\n" +
                "   * Route Price: \u001B[9m" + (super.getReservedCar().route.tripPrice) + "SR\u001B[0m " + super.getTripCost() + "SR");
    }
}
