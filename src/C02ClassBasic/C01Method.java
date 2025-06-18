package C02ClassBasic;

public class C01Method {
    public static void main(String[] args) {
        //접근제어자(public), 클래스 메서드(static)
        //클래스 메서드 기본 호출 방식 : 클래스명.메서드명();
        // ex) C01Method.sumAcc(1,10);
        System.out.println(C01Method.sumAcc(1,10));

        //같은 클래스내에서 메서드를 호출하면 메서드명 생략이 가능하다.
    }

    public static int sumAcc(int start, int end){
        int sum =0;
        for(int i=start; i<=end; i++){
            sum+=i;
        }
        return sum;
    }
}
