public class Carnivore extends Mammalia{
    Carnivore(String name, int age){
        super(name, age);
    }

    public void eat(Object animalName) {
        if(animalName instanceof Mammalia) {
            System.out.println(name + ((Mammalia)animalName).name + "를 먹는다.");
        }
    }

    Mammalia reproduce(String newName) {
        Carnivore carnivore = new Carnivore(name, age);
        Mammalia reproduce = carnivore;
        return reproduce;
    }
}
