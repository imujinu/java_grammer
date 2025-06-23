package C03Inheritance;
// 같은 패키지 내의 클래스가 아닌 경우에는 import가 필요

// class에는 private과 default 접근제어자만 존재한다.
public class C04ProtectedClass {
    // 변수, 메서드
    // public : 프로젝트 전체에서 접근 가능 ( 다른 패키지여도 접근 가능)
    // private : 클래스 내에서만 접근 가능
    // default : 생략 가능 패키지 내에서만 접근 가능
    // protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근가능
    public String str1 = "hello java";
    private String str2 = "hello java";
    String str3 = "hello java";
    protected String str4 = "hello java4";


}
