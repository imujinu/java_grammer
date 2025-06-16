package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        // key ,value로 이루어져 잇다
        // key 값은 중복이 있으면 value를 덮어쓰기
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("농구",2);
//        sports.put("배구",1);
//        // map은 key를 통해 value를 set
//        // key값을 시간 복잡도는 O(1)
//        System.out.println(sports.get("농구"));
//
//        // map의 전체데이터 출력
//        // map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
//        // keySet() : map의 key 목록을 리턴하는 메서드
//        // values() : map의 value목록을 리턴
//        int total3 =0;
//        for(int i=0; i< sports.size(); i++){
//            total3+= sports.values();
//        }
//
////        for(int n : sports.values()){
////            total += n;
////        }
////        System.out.println(total);
//        int total2 =0;
//        for(String k : sports.keySet()){
//            total2+=sports.get(k);
//        }
//        System.out.println(total2);
//
//        // remove : 키를 통해 map 요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
//        // map에서 기존의 key 값에 put 할 경우 덮어쓰기
//        sports.put("배구", 10);
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//
////        pullIfAbsent : key값이 없는 경우에만 put 하겠다.
//
//        sports.putIfAbsent("soccer", "농구");
//        sports.putIfAbsent("tennis", "테니스");
//        System.out.println(sports);
//        // containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("golf"));
//
//        //1.foreach문
//        for(String a: sports.keySet()){
//            System.out.println(sports.get(a));
//        }
//        Set<String> set = sports.keySet();
//        for(String a: set){
//            System.out.println(a);
//        }
        //2. iterator 활용
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//        // next
//
//        // hasNext메서드는 Iterator안에서 다음 값이 있는지 없는지 boolean값을 리턴
//
//        Iterator<String> iterators = sports.keySet().iterator();
//        while(iterators.hasNext()){
//            System.out.println(iterators.next());
//        }
//        HashMap<String,Integer> parti = new HashMap<>();
//        parti.getOrDefault(parti.get(),0)
//        Map<String, Integer> map = new HashMap<>();
//        map.put("축구",3);
//        map.put("농구",2);
//        map.put("야구",1);
//        // 가장 value가 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//        String keyValue = "";
//        for(String str : map.keySet()){
//            int value = map.get(str);
//            if(value>max){
//                max=value;
//                keyValue = str;
//            }
//        }
//        System.out.println(keyValue);
            // LinkedHashMap : 데이터의 삽입순서를 보장(유지)

        // TreeMap : key를 정렬하여 map을 저장 default : 오름차순

//        Map<String, Integer> map = new TreeMap<>();
//        map.put("hello5",1);
//        map.put("hello4",3);
//        map.put("hello3",5);
//        map.put("hello1",4);
//        map.put("hello2",2);
//        for(String str : map.keySet()){
//            System.out.println(str);
//        }



    }
}
