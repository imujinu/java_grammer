package C06EtcClass;

public class C01Math {
    public static void main(String[] args) {

        // 로또번호 7개 뽑기. 0~99까지의 임의 숫자.
        for(int i=0; i<7; i++){
            System.out.println((int)(Math.random()*100));
        }
        Math.max(3,5);
    }
}
