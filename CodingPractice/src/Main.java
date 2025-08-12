//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
//        5월19일 문제
//        13, 14, 15 번 문제
//        16, 17 번 문제
//        18번 문제
//        19번, 20번 문제
//        19번문제에서
//        Account : 속성{ 계좌번호(accountNumber), 계좌주(accountName), 금액(money) }
//        동작{ 생성자(계좌번호,계좌주), addMoney(금액), subMoney(금액) }
//        20번문제에서
//        BankApplication : 동작 { 계좌생성(addAccount), 계좌목록(printAccounts)
//                , 예금(deposit), 출금(draw), 종료(exit) }
//        Scanner scan = new Scanner();
//        String input = scan.nextLine(); // input 에 키보드 입력된 문자열이 저장됩니다.


//        solution15 sol15 = new solution15();
//        boolean result = sol15.login("hong", "12345");
//        if(result){
//            System.out.println("로그인 완료");
//            sol15.logout("hong");
//        } else {
//            System.out.println("id 또는 패스워드 부재");
//        }

//        solution16 printer = new solution16();
//        printer.Printer(10);
//        printer.Printer(true);
//        printer.Printer(5.7);
//        printer.Printer("홍길동");

//        solution16.Printer(10);
//        solution16.Printer(true);
//        solution16.Printer(5.7);
//        solution16.Printer("홍길동");
//
//        Solution17 sol = Solution17.getInstance();
//        Solution17 sol2 = Solution17.getInstance();
//        if(sol == sol2) {
//            System.out.println("주소가 같다 = 싱글톤");
//        } else {
//            System.out.println("주소를 공유하지 않는다 = 싱글톤이 아님");
//        }

//        5월21일 문제
//        com.mjc813.studyjava.Animal 클래스
//        멤버변수 : String name, int age
//        멤버메소드 : void eat(Object feed) {출력 "{이름}은 {feed}를 먹는다"}
//        void sleep() {출력 "{이름} 잔다"}
//        void move() {출력 "{이름} 이동한다"}
//        Animal reproduce(String newName) {Animal 객체의 이름을 정해서 생성하고 리턴한다}
//
//        com.mjc813.studyjava.Bird 클래스 는 Animal 클래스를 상속받는다.
//        멤버변수 : String wings ("날개")
//        멤버메소드 : void flap() {출력 "{이름} {날개} 날개짓한다."}
//        void fly() {출력 "{이름} {날개} 난다."}
//        부모의 reproduce 를 재정의 해서 return Bird 객체가 되도록 한다.
//
//                com.mjc813.studyjava.Parrot 클래스 는 Bird 클래스를 상속받는다.
//                멤버메소드 : fly 메소드를 재정의 하여서 {출력 "{이름} {날개} 조금만 난다."}
//        eat 메소드를 재정의 하여서 매개변수에는 String 데이터형태만 입력되어서 "{이름}은 {곡식이름}를 먹는다"로 출력하도록 재정의한다.
//                부모의 reproduce 를 재정의 해서 return Parrot 객체가 되도록 한다.
//
//                com.mjc813.studyjava.Eagle 클래스 는 Bird 클래스를 상속받는다.
//                멤버메소드 : fly 메소드를 재정의 하여서 {출력 "{이름} {날개} 높이 난다."}
//        eat 메소드를 재정의 하여서 매개변수에는 Animal 데이터형태만 입력되어서 "{이름}은 {동물이름}를 먹는다"로 출력하도록 재정의한다.
//                부모의 reproduce 를 재정의 해서 return Eagle 객체가 되도록 한다.
//
//
//                com.mjc813.studyjava.Mammalia 클래스 는 Animal 클래스를 상속받는다.
//                멤버메소드 : void feedingMilk() {출력 "{이름} 젖을 먹인다.}
//            eat 메소드를 재정의 하여서 매개변수에는 String 데이터형태만 입력되어서 "{이름}은 {음식이름}를 먹는다"로 출력하도록 재정의한다.
//                    부모의 reproduce 를 재정의 해서 return Mammalia 객체가 되도록 한다.
//
//                    com.mjc813.studyjava.Herbivore 클래스 는 Mammalia 클래스를 상속받는다.
//                    멤버메소드 : 부모의 reproduce 를 재정의 해서 return Herbivore 객체가 되도록 한다.
//
//                    com.mjc813.studyjava.Carnivore 클래스 는 Mammalia 클래스를 상속받는다.
//                    멤버메소드 : eat 메소드를 재정의 하여서 매개변수에는 Herbivore 데이터형태만 입력되어서 "{이름}은 {초식동물이름}를 먹는다"로 출력하도록 재정의한다.
//                    부모의 reproduce 를 재정의 해서 return Carnivore 객체가 되도록 한다.
//
//                    Main 에서 Animal, Bird, Parrot, Eagle, Mammalia, Herbivore, Carnivore 객체를 하나 이상씩 만들어서
//            각각의 메소드를 실행하고 출력 해 보세요 (정답이 없습니다.)
//            특히 reproduce 메소드를 실행하여 객체를 직접 낳는 실행을 해보고, 그 객체가 인스턴스됐는지 아무 메소드나 실행해 보세요.
//
        Animal animal = new Animal("동물", 1);
        animal.sleep();
        animal.move();
        Bird bird = new Bird("새",1,"날개");
        bird.flap();
        bird.fly();
        Parrot parrot = new Parrot("앵무새", 2, "앵무새날개");
        parrot.eat("모이");
        parrot.fly();
        
        Eagle eagle = new Eagle("독수리", 2, "독수리 날개");

    }
}