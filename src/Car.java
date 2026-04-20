public class Car {
    protected String code;
    protected int maxCapacity;
    protected final Route route;

    //constructor
    public Car(String code, int maxCapacity, Route route) throws IllegalArgumentException{
        if (maxCapacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.route = route;
    }
}
