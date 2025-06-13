package C01Basic;

import java.util.HashMap;
import java.util.Map;

public class C09Map {
    public static void main(String[] args) {
        // key ,value로 이루어져 잇다
        // key 값은 중복이 있으면 value를 덮어쓰기
        Map<String, Integer> sports = new HashMap<>();
        sports.put("농구",2);
        sports.put("배구",1);
        // map은 key를 통해 value를 set
        // key값을 시간 복잡도는 O(1)
    }
}
