package C05AnonymousLamda;

public class C02AnonymousClass {
    public static void main(String[] args) {
        //AbstractAnimal을 상속한 클래스가 별도로 존재하지 않고
        //익명 클래스가 만들어짐과 동시에 익명 객체가 만들어지고 있음

        //구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성 가능
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound1() {

            }

            @Override
            public void makeSound2() {

            }
        };
        // 인터페이스의 익명객체에 구현 메서드가 1개밖에 없을때에는 람다표현식(화살표함수) 사용가능
        Animal2 a3 =()->{
            System.out.println("hello word1");
            System.out.println("hello word2");
        };
        a3.makeSound1();
        // 실행문이 1줄 일때는 {} 제거 가능
        Animal2 a4 = ()-> System.out.println("hello world3");

        Animal3 a5 = (a, b, c)->
            a + b + c;

        System.out.println(a5.makeSound("dog","dog","dog"));
        Animal4 a6 = (a,b,c)->{
            if(c>=10) return a+b;
            else{
                return a;
            }
        };
        System.out.println(a6.makeSound("하이","바이",9));
    }
}


abstract class AbstractAnimal{
    abstract void makeSound1();

}

interface Animal1{
    void makeSound1();
    void makeSound2();
}
interface Animal2{
    void makeSound1();
}

interface Animal3{
    String makeSound(String a, String b, String c);
}

interface Animal4{
    String makeSound(String a, String b, int c);
}