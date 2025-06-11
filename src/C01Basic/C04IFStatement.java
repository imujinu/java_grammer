package C01Basic;

import java.util.Scanner;

public class C04IFStatement {
    public static void main(String[] args) {
        int answer =1234;
        Scanner sc = new Scanner(System.in);
        if(answer == sc.nextInt()) System.out.println("문이 열렸습니다.");
        else System.out.println("비밀번호가 틀렸습니다.");

        //

    }
}
