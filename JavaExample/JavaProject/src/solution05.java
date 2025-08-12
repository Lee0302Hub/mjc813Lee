//중첩 for문을 사용하여 방적식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력하는 코드를 작성하라.
//단 x와 y는 10 이하의 자연수이다.
public class solution05 {
    public void xySol() {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                if((4*i) + (5*j) == 60) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}