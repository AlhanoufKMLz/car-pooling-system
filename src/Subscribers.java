public class Subscribers extends Passenger{

    //constructor
    public Subscribers(String name, String id, Car reservedCar, double tripCost) {
        super(name, id, reservedCar, tripCost);
    }


    //Extra methods
    @Override
    public double reserveCar(Car car) throws Exception {
        if(car.maxCapacity == 0)
            throw new Exception("This car is full!");

        super.setReservedCar(car);
        car.maxCapacity--;
        super.setTripCost(car.route.tripPrice * 0.5);
        return super.getTripCost();
    }

    @Override
    public void displayInfo() {
        System.out.println("Passenger Name: " + super.getName() + "\n" +
                            "Passenger Id: " + super.getId() + "\n" +
                            "Reserved Car Code: " + super.getReservedCar().code + "\n" +
                            "Route Price: " + super.getTripCost());
    }
}
