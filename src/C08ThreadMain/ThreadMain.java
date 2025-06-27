package C08ThreadMain;

import java.sql.Array;
import java.util.ArrayList;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
//        // 단일 쓰레드 실행
//        for(int i=0; i<1000; i++){
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());
         // 멀티스레드 생성
        // 방법1. 스레드 클래스 상속
//        Thread t1 = new MyThread();
//        Thread t2 = new MyThread();
//        Thread t3 = new MyThread();
//        Thread t4 = new MyThread();
//        // thread 클래스 안에 start 메서드 내장되어 있고 start 메서드는 run 메서드를 호출하면서 스레드 생성.
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("hello world");
//        // 방법 2. Runnable을 직접 구현한 객체를 thread 클래스 생성자에 주입하는 방식
//        new Thread(()-> System.out.println("스레드 시작1")).start();
//        new Thread(()-> System.out.println("스레드 시작2")).start();
//        new Thread(()-> System.out.println("스레드 시작3")).start();
//        new Thread(()-> System.out.println("스레드 시작4")).start();
//        System.out.println("hello world");

        //멀티스레드 동시성 이슈 테스트
        long start = System.currentTimeMillis();
        for (int i=0; i<1000; i++){
            Thread t1 = new Thread(()->{Library.borrow();});
            t1.start();
            t1.join();
            // 한 스레드의 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행
            // -> 사실상 단일 스레드 처럼 동작 되므로 성능 저하 발생
        }
        long end = System.currentTimeMillis();

        Thread.sleep(20000);
        System.out.println(Library.getBookCount());

    }
}
