public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Kia", 100000);
        Boat boat = new Boat("Titanic", 1000000);

        System.out.println(car.performAction());
        System.out.println(boat.performAction());
    }
}
