package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C05Scope {
    static int v2 = 10;

    public static void main(String[] args) {
        //지역 변수의 유효 범위
            int v1 =10;
            scope(v1);
        System.out.println(v1);
        // 객체의 유효범위
        C04Person p1 = new C04Person();
        p1.updateName("진우","jin@nav.com",20);
        scope2(p1);
        System.out.println(p1.printPerson2());

        List<C04Person> myList = new ArrayList<>();
        myList.add(p1);
        myList.get(0).setAge(40);
        System.out.println(p1.printPerson2());

        //클래스의 유효 범위


    }

    public static void scope(int v1){ // call by value 값을 던졌다.
        v1=20;
        System.out.println(v1);
    }
// 원시형 변수는 스택에 저장되어 있던 변수값을 넘겨준다. 그래서 다른 메서드에서 값을 변경해도 바뀌지 않는다.
    public static void scope2(C04Person person){ // 힙 메모리 주소 , call by reference
        person.setAge(30);
        System.out.println(person.printPerson2());
    }
    // 객체는 힙 메모리 주소값을 넘겨주기 때문에 다른 곳에서 변경해도 변경이 이뤄진다.
}
