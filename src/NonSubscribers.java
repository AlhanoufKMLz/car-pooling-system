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


    //Extra methods
    @Override
    public void reserveCar(Car car) throws Exception{
        if(car.maxCapacity == 0)
            throw new Exception("This car is full!");

        super.setReservedCar(car);
        car.maxCapacity--;
        super.setTripCost( discount ? car.route.tripPrice - (car.route.tripPrice * 0.1) : car.route.tripPrice );
    }

    @Override
    public void displayInfo() throws Exception{
        if(super.getReservedCar() == null) throw new Exception("This passenger is not reserved in any trip!");

        System.out.println("Passenger Name: " + super.getName() + "\n" +
                            "Passenger Id: " + super.getId() + "\n" +
                            "Reserved Car Code: " + super.getReservedCar().code + "\n" +
                            "Route Price: " + (discount ? "\u001B[9m" + (super.getReservedCar().route.tripPrice) + "SR\u001B[0m " : "" )+ super.getTripCost() + "SR");
    }
}
