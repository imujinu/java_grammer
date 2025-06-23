package C03Inheritance;

import java.util.List;

public class C06AbstractMain {
    public static void main(String[] args) {
        AbstractDog d1 = new AbstractDog();
        d1.makeSound1();
        d1.makeSound2();

        //추상 클래스는 구현체없는 메서드가 있으므로 기본적으로 기본적으로 객체 생성 불가능
        //익명객체를 이용 시 가능

        // 객체의 실체가 dog클래스를 통해 만들어지므로 d2의 makesound2를 사용가능하다.
        AbstractAnimal d2 = new AbstractDog();
        d2.makeSound1();
        d2.makeSound2();

        //모든 메서드가 abstract인 클래스를 인터페이스라 한다.
        // List<integer> myList = new List<>();
        // 인터페이스는 구현체가 없으므로 기본적으로 별도의 객체 생성 불가.

    }
}

abstract class AbstractAnimal{

    void makeSound1(){
        System.out.println("동물 소리를 냅니다.");
    }

    abstract void makeSound2();

}

class AbstractDog extends AbstractAnimal {
    @Override
    void makeSound2() {

    }
}

//final이 붙으면 상속, overriding모두 불가능.
final class finalParents{

}