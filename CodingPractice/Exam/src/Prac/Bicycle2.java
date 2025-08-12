package Prac;

public class Bicycle2 implements IBicycle{
    String name;
    int wheelCount;

    public Bicycle2(String name, int wheel) {
        this.name = name;
         wheelCount = wheel;
    }

    @Override
    public String drive() {
        return (String)(wheelCount + "개의 바퀴의 " + name + "를 이동한다.");
    }

    @Override
    public String breaking() {
        return (String)(name + "을 정지한다.");
    }
}
