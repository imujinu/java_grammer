package C03Inheritance;

public class C0302SuperKeyword extends SuperParents{
    int a = 10;
    public static void main(String[] args) {
        C0302SuperKeyword c2 = new C0302SuperKeyword();
        System.out.println(c2.a);
    }
}

class SuperParents{
    int a = 20;
}
