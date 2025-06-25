package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04GenericMain {
    public static void main(String[] args) {
            String[] stArr = {"java","python","c"};

            Integer[] arr = {10,20,30};
            intChange(arr,0,1);

            allChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));

        Person p = new Person("hong");
        GenericPerson<Integer> gp = new GenericPerson<>(5);
        System.out.println(gp.getValue());
    }
    // 제네릭 메서드는 반환타임 왼쪽에 선언
    // T에는 참조형 변수인 객체 타입만을 허용
    static <T> void allChange(T[] arr, int a, int b){
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void stChange(String[] arr, int idx1, int idx2){
     String temp = arr[idx1];
     arr[idx1] = arr[idx2];
     arr[idx2] = temp;
    }static void intChange(Integer[] arr, int idx1, int idx2){
        Integer temp = arr[idx1];
     arr[idx1] = arr[idx2];
     arr[idx2] = temp;
    }
}

//제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setName(T value) {
        this.value = value;
    }

    public GenericPerson(T name) {
        this.value = name;
    }
}

class Person{
    private String value;

    public String getValue() {
        return value;
    }

    public void setName(String value) {
        this.value = value;
    }

    public Person(String name) {
        this.value = name;
    }
}