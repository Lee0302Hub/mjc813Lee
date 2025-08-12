package Prac;

public class Driver {
    String name;
    //int age;
    Vehicle vehicle;

    public Driver(String name, Vehicle other) {
        this.name = name;
        vehicle = other;
    }

    public void drive() {
        if(vehicle instanceof Truck) {
            vehicle = new Truck();
            vehicle.move();
        } else {
            vehicle = new Bicycle();
            vehicle.move();
        }
    }

    public void breaking() {
        vehicle.stop();
    }
}
