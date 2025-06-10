package C01Basic;

//클래스의 명명규칙
//1) 반드시 public class명과 파일명이 일치해야한다.
//2) 일반적으로 대문자 알파벳으로 시작
public class C00HelloWorld {
    // 메서드명, 변수명은 일반적으로 소문자 알파벳으로 시작
    // 어디에서든 접근가능하고, 리턴값이 없는 메서드
    // mai 메서드는 프로그램 실행 시 가장 먼저 실행되는 메서드
    //누군가 호출할 일 없이 가장 먼저 실행되기 때문에 반환값이 없다.
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
