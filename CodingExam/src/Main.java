//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {

    public static void main(String[] args) {
        var allow = "Google!";
        System.out.println(allow);
        int i = 300;
        byte b = (byte) i;
        System.out.println("b에 저장될 떄 오버플로우가 발생" + b);
    }
}