public class NoStaticClass {

    private int age;
    private String name;

    public NoStaticClass(int age, String nm) {
        this.age = age;
        name = nm;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
