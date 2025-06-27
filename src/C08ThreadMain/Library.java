package C08ThreadMain;

public class Library {
    private static int bookCount = 100;
//    public synchronized static void borrow() {
        // synchronized : 메서드 내에서 1개의 스레드만 실행되도록 강제
        // rdb를 사용할 경우 커밋이 끝나기 직전에 다음 스레드가 실행되면 동시성 이슈가 발생한다.
    public static void borrow() {
        if(bookCount>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount--;
            System.out.println("대출완료");
        }else{
            System.out.println("대출불가");
        }
    }
    public static int getBookCount(){
      return bookCount;
    };
}
