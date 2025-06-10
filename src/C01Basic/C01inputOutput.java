package C01Basic;

import java.io.BufferedReader;
import java.util.Scanner;

public class C01inputOutput {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // 입력받은 데이터를 한줄로 읽어서, String으로 리턴
        String input = sc.nextLine();
        System.out.println(input);


    }
}
