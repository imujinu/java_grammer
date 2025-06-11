package C01Basic;

import java.util.Scanner;

public class C05LoopStatement {
    public static void main(String[] args) {
//        //do while문
//
//        // for 문 : 초기식, 조건식, 증감식이 모두 포함돼 있는 반복문
//        for(int i=1; i<10; i+=2){
////            System.out.println(i);
//        }
//
//        //두 수의 최대 공약수 찾기
//        int a = 24;
//        int b = 36;
//        int c = 0;
//        int min = Math.min(a,b);
//
//        for(int i=min; i>0; i--){
//            if(a%i==0 && b%i==0){
//                c=i;
//                break;
//            }
//        }
////        System.out.println(c);
//        //소수 구하기 : 1과 자신을 제외한 숫자로 나누어지지 않는 수
//        // 사용자가 입력한 값이 소수인지 아닌지 판별해주는 프로그램.
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        boolean isPrime = true;
//        for(int i=2; i<input; i++){
//            if(input%i==0)isPrime=false;
//        }
//
////        System.out.println(isPrime? "소수입니다" : "소수가 아닙니다");
//
////        continue : 반복문의 조건식으로 이동하는 명령어.
//        //홀수만 출력
//        for (int i =0; i<11; i++){
//            if(i%2==0){
////                continue는 코드의 직관성과 가독성을 위해 사용
//                continue;
//
//            }
//            System.out.println(i);
//        }
//
////        향상된(enhanced) for문 - for each 문
//        String[] 배열명 = {};
//        // 향상된 for문을 활용한 배열 접근 방식
//        // 일반 for문을 통한 arr의 저장된 값 변경
//
//        // 향상된 for문을 통한 arr의 저장된 값 변경 -> 원본의 값 변경 불가
//
//        // 참조형 변수 (객체 타입) 는 기본적으로 변수를 통한 출력 시에 메모리값이 출력.1
//
//        //자바 범수의 유효범위 : {}
//        int num = 10;
//        // 라벨문 : 반복문에 이름을 붙이는 것.
////        loop1;
////        for(int i=0; i<10; i++){
////            loop2;
////            for(int j=0; j<10; j++){
////                if(true){
////                    break loop1;
////                }
////            }
////        }
        int[][] arr = {{1,2,3}, {4,5,11},{7,8,9},{10,11,12}};
        int idx = 0;
        int idx2 = 0;
        loop1:
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==11){
                idx=i;
                idx2=j;
                break loop1;
                }
            }
        }

        //라벨링 활용 문제풀이
        //100~200까지 수 중에서 가장 작은 소수를 출력
        loop:
        for(int i=15; i<=200; i++){
            boolean isPrime = false;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = true;
                    break ;
                }

            }
            if(!isPrime){
                System.out.println(i);
                break ;
            }

        }
    }
}
