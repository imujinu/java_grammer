package C03Inheritance;

public class C0302SuperKeyword extends SuperParents{
    int a = 10;
    public static void main(String[] args) {
        C0302SuperKeyword c2 = new C0302SuperKeyword();
        System.out.println(c2.a);
        c2.display();
    }
    public void display(){
        System.out.println("자식의 변수" + a);
        System.out.println("부모의 변수" + super.a);
    }
    C0302SuperKeyword(){
        super(20);
        this.a = 20;
    }
    //super() : 부모클래스의 생성자를 호출하는 메서드
}

class SuperParents{
    int a ;

    public SuperParents(int a){
        this.a = a ;
    }

}
