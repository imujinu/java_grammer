package C05AnonymousLamda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
        //String 클래스에 compareTo 메서드 내장
        //많은 클래스에서 Comparable을 구현하여 compareTo 메서드를 구현하고 있다.
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b));

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("javascript");
        Collections.sort(myList);
        myList.sort(Comparator.naturalOrder());

        // 직접 만든 student를 list에 담아 정렬

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("kim",20));
        studentList.add(new Student("lee",23));
        studentList.add(new Student("park",34));
        studentList.add(new Student("choi",42));
        studentList.add(new Student("yoon",28));

        //정렬방법 1. Students 객체에서 Comparable 객체 구현.
        //Collections.sort에서 Comparable 객체를 요구.
//        Collections.sort(studentList);
//        System.out.println(studentList);
        //list는 comparable을 상속하지 않았다.

        //정렬방법 2. Comparator 구현한 익명객체를 사용
        // 정렬 메서드에서 Comparator 객체를 요구하는 메서드가 많다.
        studentList.sort((o1,o2)->o2.getAge()- o1.getAge());
        System.out.println(studentList);

        String[] stArr = {"hello","java","c++","world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr, Comparator.reverseOrder());
        Arrays.sort(stArr, (str1,str2)->str2.length()-str1.length());
        System.out.println(Arrays.toString(stArr));

        List<int[]> list = new ArrayList<>();
        list.add(new int[]{4,5});
        list.add(new int[]{1,2});
        list.add(new int[]{5,0});
        list.add(new int[]{3,1});
        list.sort((arr1,arr2)->arr2[1]-arr1[1]);
        for(int[] arr : list){
            System.out.println(Arrays.toString(arr));
        }
    }
}

class Student implements Comparable<Student>{


    private String name;
    private int age;

    //this가 앞에 있을 땐 오름차순, 뒤에 있을 땐 내림차순으로 정렬 로직 수행.
    @Override
    public int compareTo(Student o) {
        return this.getName().compareTo(o.getName());
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}