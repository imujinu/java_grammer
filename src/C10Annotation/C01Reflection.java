package C10Annotation;

import java.lang.reflect.Field;
import java.util.NoSuchElementException;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
            //리플렉션 : 런타임 시점에 클래스의 변수를 수정할 수 있는 기능
        Person person = new Person();
        Field name = Person.class.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person, "jinwoo");
        System.out.println(person);
    }
}

class Person{
    private String name;

    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}