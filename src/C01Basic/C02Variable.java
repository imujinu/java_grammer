package C01Basic;

import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//    // byte 1바이트 int 4바이트 long 8바이트
//        // 오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선경우
//        byte a = 127;
//        a++;
//        // 언더플로우 :
//        byte b = -128;
//        b--;
////        System.out.println(a);
////        System.out.println(b);
//        //long은 명시적으로 L을 붙여 long 타입을 명시하기도 함
//        long l2 = 20L;
//
//        // 실수 : float, double(기본) - > 실수연산은 오차를 발생시킴.
//
//        float f1 = 1.123f;
//        double d1 = 1.123;
//
//        double d2 = 0.1;
//
//        double total = 0;
//
//        for(int i=0; i<1000; i++){
//            total += 0.1;
//        }
//
//        //정수로 변환 후 연산하여 추후 나눗셈으로 해결
//        double total2 = 0;
//
//        for(int i=0; i<1000; i++){
//            total2 += 0.1*10;
//        }
////        System.out.println(total2/10);
//        // 소수점 오차 해결 방법 : Bigdecimal 클래스 사용
//        double d3 = 1.03;
//        double d4 = 0.42;
////        System.out.println(d3-d4);
//
//        BigDecimal b1 = new BigDecimal("1.03"); // 값을 입력받을 때부터 소숫점으로 받게 되면 이미 오차가 발생하므로 문자로 입력.
//        BigDecimal b2 = new BigDecimal("0.42"); //
//        double b3 = b1.subtract(b2).doubleValue();
//
////        System.out.println(b3);
////        문자형 : char
//        char c1 = '가';
//       String str1 =  "가나";
        // 참조형 자료에 값을 할당하지 않으면 null이 할당
//        String str1= "";
//        String str2 = null;
//        String str3;
//        System.out.println(str1.isEmpty());
//        System.out.println(str2.isEmpty()); // null을 대상으로 string의 메서드 사용 불가

//        타입변환
//        묵시적 타입변환
        char c1 ='a';
        int i1 = c1;
//        문자 비교를 위한 묵시적 타입변환
//        char로 선언해주지 않아도 문자 하나만 계산을 해주면 숫지로 치환 후 계산
        //알파벳 소문자 제거 문제
        String str1 = "01abcd123한글123";
        String answer = "";
        for(int i =0; i<str1.length(); i++){
            if(str1.charAt(i)>'z' || str1.charAt(i)<'a')answer+=str1.charAt(i);
        }
        System.out.println(answer);
        // 두 수가 모두 정수이면 결과값이 정수일것이다라고 java가 판단

    }
}
