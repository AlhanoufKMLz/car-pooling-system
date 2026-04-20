public class Subscribers extends Passenger{

    //constructor
    public Subscribers(String name, String id) {
        super(name, id);
    }


    //Extra methods
    @Override
    public void reserveCar(Car car) throws Exception {
        if(car.maxCapacity == 0)
            throw new Exception("Sorry.. this car is full!");

        super.setReservedCar(car);
        car.maxCapacity--;
        super.setTripCost(car.route.tripPrice * 0.5);
    }

    @Override
    public void displayInfo() throws Exception{
        if(super.getReservedCar() == null) throw new Exception("This passenger is not reserved in any trip!");

        System.out.println("Passenger Name: " + super.getName() + "\n" +
                            "Passenger Id: " + super.getId() + "\n" +
                            "Reserved Car Code: " + super.getReservedCar().code + "\n" +
                            "Route Price: \u001B[9m" + (super.getReservedCar().route.tripPrice) + "SR\u001B[0m " + super.getTripCost() + "SR");
    }
}
