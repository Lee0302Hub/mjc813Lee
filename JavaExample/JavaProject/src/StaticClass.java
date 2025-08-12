public class StaticClass {
    public String name;
    public static int age = 1;
    public static String names;
    public static void printMember() {
        System.out.println("age : " + age);
//        System.out.println("name : " + name); <-- static 변수가 아닌 멤버변수는 new연산자로 할당하지 않고는 사용할 수 없음.
        //static 영역(클래스 영역)에 프로그램이 시작하자마자 올라오는 멤버변수가 static int 멤버변수이고,
        //그 외의 멤버변수는 new 연산자로 할당해야 그제야 객체를 생성하여 멤버변수가 있는 인스턴스를 힙에 할당하여 사용가능한 상태가 되는 것이다.
    }
}
