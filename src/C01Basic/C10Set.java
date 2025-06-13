package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
        // 중복 X , 순서 보장 X
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("h");
        mySet.add("h");
        mySet.add("o");
        mySet.add("o");
        mySet.add("i");
        mySet.add("i");
        System.out.println(mySet);
        // 향상된 포문으로 값을 출력해야함
    }
}
