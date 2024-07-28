package assignment10;

public class Car extends Vehicle {
    public int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); 
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2020, 4);
        car.displayDetails();
    }
}