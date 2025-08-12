public class Parrot extends Bird{
    Parrot(String name, int age, String wings) {
        super(name, age, wings);
    }
    @Override
    public void fly() {
        System.out.println(name + wings + "조금만 난다");
    }

    @Override
    public void eat(Object feedName) {
        System.out.println(name + "은 " + (String)feedName + "를 먹는다" );
    }

    @Override
    Bird reproduce(String newName) {
        Parrot parrot = new Parrot(newName, age, wings);
        Bird reproduce = parrot;
        return reproduce;
    }
}
