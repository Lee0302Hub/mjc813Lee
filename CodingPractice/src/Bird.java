public class Bird extends Animal{
    Bird(String name, int age,String wings) {
        super(name, age);
        this.wings = wings;
    }

    String wings;
    
    public void flap() {
        System.out.println(name+" " + wings + " 날개짓한다");
    }
    public void fly() {
        System.out.println(name +" "+ wings + " 난다");
    }

    @Override
    Animal reproduce(String newName) {
        Bird bird = new Bird(newName, age, wings);
        Animal reproduce = (Animal)bird;
        return reproduce;
    }
}
