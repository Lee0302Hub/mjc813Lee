public class Animal {
    String name;
    int age;
    Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(Object feed) {
        System.out.println(name + "은 " + feed + "를 먹는다" );
    }
    public void sleep() {System.out.println(name + "은 잔다.");}
    public void move() {System.out.println(name + "은 이동한다.");}

    Animal reproduce(String newName) {
        Animal reproduce = new Animal(name, age);
        reproduce.name = newName;
        return reproduce;
    }

}
