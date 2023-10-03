public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String performAction() {
        return "Je suis " + this.getBrand() + "et je fais vroum vroum !" ;
    }
}