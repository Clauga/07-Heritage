public class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }
    @Override
    public String performAction() {
        return "Je suis " + this.getBrand() + " et je fais glou glou !";
    }

}
