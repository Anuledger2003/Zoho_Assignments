package assignment4;
/*
 * 2. In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
 */
public abstract class Vehicle {
    public abstract void start() ;
    public abstract void stop() ;
    
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.start();
        v1.stop();
        v2.start();
        v2.stop();
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}
