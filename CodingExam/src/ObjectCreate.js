class Person {
    name = ""; age; gender = ""; height = 100;
    constructor(name , age, gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    personSet() {
        this.name = "Lee";
        this.age = 20;
        this.gender = "man";
    }
    print() {
        console.log(JSON.stringify(Person));
    }

}
class Zeep extends Person {
    //Car 클래스를 상속받아서 Zeep클래스를 선언한다. -> Car클래스에 존재하는 멤버변수와 멤버메소드를 모두 사용할 수 있다.**(부모의 모든 속성과 메소드를 사용 가능
    //부모의 속성과 메소드를 가질 수 있는 것은 포함관계와 상속이 있다.ㅁ
    engine = "";
    constructor(name, age, gender, engine) {
        super(name, age, gender); //부모클래스에게 상속받은 멤버변수들
        this.engine = engine; // 본인 클래스에만 추가된 멤버변수
    }
    fourWd() {
        alert(this.name + " " + this.age + " " + this.gender + " " + this.engine);
        //해당 fourWd()메소드 즉, Zeep 내의 메서드만이 아닌 상속받은 Person의 메서드도 사용할 수 있다.
    }
}
