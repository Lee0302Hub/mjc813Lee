package Prac;

public class Driver2 {
    String name;
    IVehicle ivehicle;

    public Driver2(String name, IVehicle other) {
        this.name = name;
         ivehicle = other;
    }

    public void drive() {
        if(ivehicle instanceof Truck2) {
            ivehicle = new Truck2("트럭", 4);
            ivehicle.drive();
            System.out.println(this.name + ivehicle.drive());

        } else {
            ivehicle = new Bicycle2("자전거", 2);
            System.out.println(this.name + ivehicle.drive());
        }
    }

    public void breaking() {
        System.out.println(ivehicle.breaking());
    }

}
