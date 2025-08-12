import java.math.BigDecimal;

public class solution01 {
    //5월12일 문제
//예를 들어 getBigDecimal(3643, 5630932); // BigDecimal 3643.5630932 를 리턴
//Integer[] getIntegerArray(int[] array); // int[] 배열을 Integer[] 로 변환해서 리턴
//int[] makeRandomIntArray(int n); n 개의 랜덤한 int 값을 가지는 int[] 배열을 리턴
//	String makeEncryptString(String text, int n);   // text 문자열의 각 한 문자를 n 번째 배수 인덱스에 배치하는 랜덤 문자열을 리턴하세요.
//랜덤문자열은 영문대문자, 영문소문자, 숫자 가능하다.
//		n 은 5이상 이어야 한다.
//		예를 들어 makeEncryptString("mjc813", 5);	=> A8dkIm8TkdjKLi9cu4Rs893sw1ksNm3
//    String makeDecryptString(String code, int n);   // code 문자열에서 n번째 배수 인덱스 문자를 뽑아서 하나의 문자열로 리턴하세요.
//예를 들어 makeDecryptString("A8dkIm8TkdjKLi9cu4Rs893sw1ksNm3", 5);	=> mjc813
//지금까지 만든 모든 메소드들에서 참조타입 매개변수의 값이 null 이면 기본데이터 값 0 또는 "" 또는 null 을 리턴하도록 수정하세요.
//Integer는 기본 정수값만이 아니라 null값도 받을 수 있는 박싱 클래스이다. 기본적으로 int는 toString()과 같은 메서드나 null을 삽입할 수 없지만,
//Boxing(기본형 데이터를 대문자가 있는 클래스형 데이터로 변환하는 것 ex, int -> Integer/ char -> CHAR)하여 바꿀수있게한다.
    public BigDecimal getBigDecimal(int a, int b) {
        String ex = Integer.toString(a) + "."+ Integer.toString(b);
        return new BigDecimal(ex);

    }
}
