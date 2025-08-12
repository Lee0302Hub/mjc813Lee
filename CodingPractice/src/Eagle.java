public class Eagle extends Bird{
    Eagle(String name,int age, String wings){
        super(name, age ,wings);
    }
    @Override
    public void fly() {
        System.out.println(name + wings + "높이 난다");
    }

    public void eat(Object animalName) {
        if(animalName instanceof Animal) {
            System.out.println(name + ((Animal)animalName).name + "를 먹는다.");
        }
    }

    Bird reproduce(String newName) {
        Eagle eagle = new Eagle(newName, age, wings);
        Bird reproduce = eagle;
        return reproduce;
    }
}
