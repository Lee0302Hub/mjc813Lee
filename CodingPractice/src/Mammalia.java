public class Mammalia extends Animal{
    Mammalia(String name, int age) {
        super(name, age);
    }
    public void feedingMilk() {System.out.println(name + "젖을 먹인다.");}
    public void eat(Object feedName) {
        System.out.println(name + (String)feedName + "를 먹는다");
    }

    Animal reproduce(String newName) {
        Mammalia mammalia = new Mammalia(name, age);
        Animal reproduce = mammalia;
        return reproduce;
    }
}
