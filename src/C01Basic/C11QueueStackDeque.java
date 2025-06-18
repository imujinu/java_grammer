package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
        //Queue 인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용한다.
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//
//        // poll : queue에서 데이터를 삭제하면서 , 동시에 return하는 메서드
//
//        // peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
//
//        // LinkedList와 ArrayList의 성능차이 비교
//        LinkedList<Integer> linkendList = new LinkedList<>();
//        for(int i=0; i<100000; i++){
//            linkendList.add(i);
//        }
//
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for(int i=0; i<100000; i++){
//            arrayList.add(i);
//        }

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//        // queue는 일반적으로 while을 통해 요소 소모
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }
        // 2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 조심

//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
////        blockingQueue.add("문서1");
////        blockingQueue.add("문서2");
////        blockingQueue.add("문서3");
////        blockingQueue.add("문서4");
//        //길제이 제한될 경우 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//        System.out.println(blockingQueue);
//
//        // 우선 순위 큐 : 데이터를 poll할 때 정렬된 데이터결과값 보장
//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
////        전체 데이터가 변경되면서 지속적으로 최솟값을 추출해야 하는 경우에 사용한다.
//
//        pq.add(10);
//        pq.add(40);
//        pq.add(330);
//        pq.add(202);
//        pq.add(10);
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        // stack : 후입 선출
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(20);
        stack.push(10);
        stack.pop();
        System.out.println(stack.peek());

        // deque : addFirst, addLast, pollLast, pollFirst, peekFirst, peekLast

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(20);
        deque.addFirst(30);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());


    }
}
