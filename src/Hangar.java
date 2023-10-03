public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Kia", 50000);
        Boat boat = new Boat("Zephyr", 120000);

        System.out.println(car.performAction());
        System.out.println(boat.performAction());
    }
}
