package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
        // 중복 X , 순서 보장 X
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("o");
//        mySet.add("o");
//        mySet.add("i");
//        mySet.add("i");
//        System.out.println(mySet);
//        // 향상된 포문으로 값을 출력해야함
//
//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(0);
//        set.add(3);
//        set.add(1);
//
//        // 1 0 3
//
//        Set<Integer> set1 = new TreeSet<>();
//        set1.add(1);
//        set1.add(1);
//        set1.add(0);
//        set1.add(3);
//        set1.add(1);
//        System.out.println(set);
//        System.out.println(set1);

        // 0 1 3

        // 집합 관련 함수 : 교집합(retainAll), 합집함(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("C++");
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("Css");
//        set1.retainAll(set2); // java
//        set1.addAll(set2); [python, C++, Css, java, html]
//        set1.removeAll(set2); [python, C++]
        System.out.println(set1);

    }
}
