public class NonSubscribers extends Passenger{
    private boolean discount;

    //constructor
    public NonSubscribers(String name, String id, Car reservedCar, double tripCost, boolean discount) {
        super(name, id, reservedCar, tripCost);
        this.discount = discount;
    }


    //getter and setter
    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }


    //Extra methods
    @Override
    public double reserveCar(Car car) throws Exception{
        if(car.maxCapacity == 0)
            throw new Exception("This car is full!");

        super.setReservedCar(car);
        super.setTripCost( discount ? car.route.tripPrice - (car.route.tripPrice * 0.1) : car.route.tripPrice );
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
