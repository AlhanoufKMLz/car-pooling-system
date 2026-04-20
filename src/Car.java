public class Car {
    protected String code;
    protected int maxCapacity;
    protected Route route;

    //constructor
    public Car(String code, int maxCapacity, Route route) {
        this.code = code;
        this.maxCapacity = maxCapacity;
        this.route = route;
    }
}
