//Alhanouf Allazzam

public class Main {
    public static void main(String[] args) {

        Route route1 = new Route("Riyadh", "Khobar", 100);
        Route route2 = new Route("Riyadh", "Qassim", 80);

        Car car1 = new Car("234432", 10, route1);
        Car car2 = new Car("234749", 3, route2);

        Passenger[] passengers = new Passenger[6];
        passengers[0] = new Subscribers("Alhanouf", "123456");
        passengers[1] = new Subscribers("Shahad", "123457");
        passengers[2] = new Subscribers("Reema", "123453");
        passengers[3] = new NonSubscribers("Sara", "123458", true);
        passengers[4] = new NonSubscribers("Rahaf", "123459", true);
        passengers[5] = new NonSubscribers("Raghad", "123450", false);


        try {
            passengers[0].reserveCar(car1);
            passengers[0].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[1].reserveCar(car2);
            passengers[1].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[2].reserveCar(car2);
            passengers[2].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[3].reserveCar(car2);
            passengers[3].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[4].reserveCar(car2); //car 2 is full here an exception should be thrown
            passengers[4].displayInfo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[5].displayInfo(); //trying to display passenger info without reserving any trip
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[1].cancelReservation(); //cancel reservation
            passengers[1].displayInfo(); //try to display info > an exception should be thrown
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        try {
            passengers[1].cancelReservation(); //try to cancel reservation for passenger who doesn't have any reservation > an exception should be thrown
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");


    }
}