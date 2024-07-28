package assignment10;

public class Truck extends Vehicle {
    public double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }

    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2021, 1.5);
        truck.displayDetails();
    }
}