package C04interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makesound();
        C01Dog d1 = new C01Dog();
        d1.makesound();
        //다형성 : 하나의 부모타입으로 여러 자식 객체를 다룰 수 있음
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makesound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makesound();

        // 예시
        List<Integer> list = new ArrayList<>();
        list.add(10);
        List<Integer> list2 = new LinkedList<>();
        list2.add(20);


        //다중 구현
        C01Cat c3 = new C01Cat();
        C01Dog d3 = new C01Dog();

        // 다중 구현의 예시 - > 인터페이스에 따라 사용가능 메서드가 제한됨
        List<Integer> list3 = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

    }
}
