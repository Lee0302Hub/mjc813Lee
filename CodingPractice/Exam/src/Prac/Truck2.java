package Prac;

public class Truck2 implements IVehicle{
    String name;
    int wheelCount;

    public Truck2(String name, int wheelCount) {
        this.name = name;
        this.wheelCount = wheelCount;
    }

    @Override
    public String drive() {
       return (String)(wheelCount + "개의 바퀴의 " + name + "을 운전한다.");
    }

    @Override
    public String breaking() {
        return (String)(name + "을 정지한다.");
    }

}
