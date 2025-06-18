package C02ClassBasic;

import java.io.BufferedReader;
import java.util.Scanner;

public class C01MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(isPrime(input)){
            System.out.println("소수입니다.");
        }else{
            System.out.println("소수가 아닙니다");
        }
    }

    static boolean isPrime(int input){
        boolean check = true;
        for(int i=2; i<=Math.sqrt(input); i++){
            if(input%i==0) check=false;

        }
        if(check) return true;
        else{
            return false;
        }
    }
}
