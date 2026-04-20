public abstract class Passenger {
    private String name;
    private String id;
    private Car reservedCar;
    private double tripCost;


    //constructor
    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }


    //setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }


    //methods
    public abstract void reserveCar(Car car) throws Exception;

    public abstract void displayInfo() throws Exception;

    //Extra methods
    public void cancelReservation() throws Exception {
        if(hasNoReservation()) throw new Exception("There is no reservation to cancel!");

        reservedCar.maxCapacity--;
        reservedCar = null;
        tripCost = 0;
    }

    public boolean hasNoReservation() {
        return reservedCar == null;
    }
}
