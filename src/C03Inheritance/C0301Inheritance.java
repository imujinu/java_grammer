package C03Inheritance;

//상속을 통해 부모의 변수와 메서드를 물려받는다.
//java에서는 클래스의 다중상속을 지원하지 않음.
public class C0301Inheritance extends Parents{
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
        System.out.println(c1.a);
        //자식 클래스에서 부모 클래스에 a변수 상속
        c1.m1();
        c1.m2();
    }
    public void m1(){
        System.out.println("나는 자식이ㅏㄷ");
    }
}
//부모 메서드의 재정의 (overriding) : 부모클래스의 메서드를 재정의하는 것.

class Parents{
    public int a = 20;
    // private 접근 제어자는 클래스 내부에서만 접근 가능, 자식 클래스에서도 접근 불가
    private int b = 20;

    public void m1(){
        System.out.println("부모클래스입니다.");
    }

    Parents(int a){
        this.b = a;
        System.out.println("부모 생성");

    }

    Parents(){

    }

    public void m2(){
        System.out.println("자식 클래스의 m2입니다.");
    }
}