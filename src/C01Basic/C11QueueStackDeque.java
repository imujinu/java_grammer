package C01Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
        //Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용한다.
        Queue<Integer> myQue = new LinkedList<>();
        myQue.add(10);

        // poll : queue에서 데이터를 삭제하면서 , 동시에 return하는 메서드

        // peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환

        // LinkedList와 ArrayList의 성능차이 비교
        LinkedList<Integer> linkendList = new LinkedList<>();
        for(int i=0; i<100000; i++){
            linkendList.add(i);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<100000; i++){
            arrayList.add(i);
        }


    }
}
