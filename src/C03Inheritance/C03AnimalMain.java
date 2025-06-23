package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Cat cat =new Cat();
        cat.sound();

        //상속관계일때는 부모클래스의 타입을 자색클래스의 객체의 타입으로 지정하는 것이 가능.
        //부모클래스의 타입을 지정 시 부모클래스의 메서드만 객체에서 사용 가능.
        Animal d2 = new Dog();
        d2.sound();

    }
}

class Animal{

    void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends  Animal{
    @Override
    void sound() {
        System.out.println("월월");
    }
    void sound2() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("냥냥");
    }
}