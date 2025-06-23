package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {

       C04ProtectedClass c04 = new C04ProtectedClass();
        System.out.println(c04.str1);
        c04.str1 = "hello python";

        C04ProtectedClass p2 = new C04ProtectedClass();
//        p2.str4
        // 이렇게 만들어진 객체는 상속 관계가 있는 객체가 아니므로 protected 변수에 접근 불가.

    }

}
