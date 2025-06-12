package C01Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
//          참조 자료형의 비교는 기본적응로 메모리주소값끼리의 비교
//        String str1 = new String("hello");
//        String str2 = new String("hello");
//        System.out.println(str1==str2);
//
//        // WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int i1 = 10;
//        // 오토 박싱 : 원시자료형 -> wrapper 클래스 자동 형변환
//        Integer ig1 = 10;
//        // 오토 언박싱 : Wrapper 클래스 -> 원시자료형으로 형변환
//        int i2 = ig1;
//
//        //Wrapper 클래스의 기능
//        int i3 = 10;
//        String str3 = Integer.toString(i3);
//        String str4 = String.valueOf(i3);
//        int i4 = Integer.parseInt(str3);
//
//        // 배열(참조자료형) 에는 원시타입 자료형 세팅 가능
//        int[] arr = {10,20,30};
//
//        // 그 외(리스트, set, map) 등에는 참조자료형을 세팅해야함
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//
        // String 선언 방법 2가지
        // 객체 선언 방식
//        String str1 = new String("hello world");
//        String str2 = new String("hello world");
//
//        // 리터럴 방식 : java에서 추천하는 방식
//        String str3 = "hello world";
//        String str4 = "hello world";
//
//        System.out.println(str1==str2); // false
//        System.out.println(str3==str4); // true
//        System.out.println(str1==str3); // false
//
//        // 참조 자료형의 비교는 ==을 지양
//        System.out.println(str1.equals(str3));

        //equals : 두 문자열 비교
//        String str1 = "hello1";
//        String str2 = "hello1";
//        String str3 = "Hello1";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));
//        System.out.println(str1.equalsIgnoreCase(str3));
//
//        //length : 문자열의 길이 출력
//        String st1= "hello1 World Java2";
//        System.out.println(st1.length());
//        //charAt(n) : 특정 index의 문자(char)값을 리턴
//        char ch1 = st1.charAt(0);
//        // 위 문자열의 소문자 알파벳의 개수 구하기
//        int count =0;
//        for(int i=0; i<st1.length(); i++){
//            if('a'<=st1.charAt(i)&& st1.charAt(i)<='z')count++;
//        }
//        System.out.println(count);
//
//        // a의 개수가 몇 개인지 출력
//        String st2 = "abcdefgabaaaa";
//        int aCount =0;
//
//        for(int i=0; i<st2.length(); i++){
//            if(st2.charAt(i)=='a')aCount++;
//        }
//        System.out.println(aCount);
//
//        // toCharArray : String 문자열을 char 배열로 리턴
//        char[] ch2 = st2.toCharArray();
//        int count2 = 0;
//        for(char ch : st2.toCharArray()){
//            if(ch=='a')count2++;
//        }
//        System.out.println(count2);
            // index Of : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환.
//        String st1 = "hello java java";
//        System.out.println(st1.indexOf("java"));
//
//        // contains : 특정 문자열이 포함되어 있는지 여부(boolean) 을 return;
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));
//
//        // 문자열 더하기 : +=
//        String str1 = "hello";
//        str1 += " world";
//        str1 += '1'; // String에 char를 더하면 String으로 더해짐
//        System.out.println(str1);

        // subString(a,b) : a이상 b 미만의 index의 문자를 잘라 문자열 반환

        // 프로그래머스 - 특정 문자 제거하기(substring으로 풀어보기)
        // trim , strip : 문자열 양쪽 끝의 공백 제거

//        String str1 = " hello world ";
//        String trim1 = str1.trim();
//        String strip1 = str1.strip();
//        System.out.println(trim1);
//        System.out.println(strip1);

            // toUpperCase : 모든 문자열을 대문자로 변환 , toLowerCase : 모든 문자열을 소문자로 변환
//        String s1 = "Hello";
//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());
//
//        // replace(a,b) : a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);
//
//
//        // replaceAll(a,b) : replace와 사용법 동일. 정규표현식을 쓸 수 있는 점이 차이점.
//        String str1 = "01abC123한글123";
//        // 소문자 알파벳 제거, 한글 제거
//        System.out.println(str1.replaceAll("[a-z]",""));
//        System.out.println(str1.replaceAll("[가-힣]",""));
//        System.out.println(str1.replaceAll("[A-Za-z]",""));

//        //전화번호 검증
//        String number = "010-1234-1234";
//        boolean check = number.matches("^\\d{3}-\\d{4}-\\d{4}$");
//        System.out.println(check);
//        //이메일 검증
//        String email = "abc1234@naver.com";
//        boolean check_email = Pattern.matches("^[a-z0-9]+@[a-z]+.com$",email);
//        System.out.println(check_email);

        //split : 특정 문자를 기준으로 잘라서 문자배열로 만드는 것.
//        String a ="a:b:c:d";
//        System.out.println(Arrays.toString(a.split(":")));
//
//        String b = "a b c  d";
//        String[] arr2 = b.split(" ");
//        System.out.println(Arrays.toString(arr2));
//        String[] arr3 = b.split("\\s+"); // \s: 공백 \n : 줄바꿈
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(b.replace(" ",""));

//        // null과 공백의 차이
//        String st1 = null; // null은 string이 아님
//        String st2 = ""; // 공백은 문자열
//        String st3 = " ";
////        System.out.println(st1.isEmpty()); // nullpointer exception이 발생
//        System.out.println(st2.isEmpty()); // true
//        System.out.println(st3.isEmpty()); // false
//        System.out.println(st3.isBlank()); // true
//
//        String abc = "hello world   java";
//
//        for(int i=0; i<abc.length(); i++){
//            if(abc.substring(i,i+1).isBlank())
//                System.out.println(i+"는 공백이다");
//        }
//
//        // 문자열 합치기
//        String[] arr = {"java","python","javascript"};
//
//        String answer1= "";
//        for(String a: arr){
//            answer1+= a+" ";
//        }
//        System.out.println(answer1);
//        // StringBuffer : 문자열 조립 객체
//        StringBuffer sb = new StringBuffer();
//        // append는 맨뒤에 문자열을 더하는 메서드.
//        sb.append("java");
//        sb.append("python");
//        sb.append("javascript");
//        System.out.println(sb.toString());
//        String[] arr = {"java","python","javascript"};
//        StringBuffer sb2 = new StringBuffer();
//        for(int i=0; i<arr.length; i++){
//            sb2.append(arr[i]);
//            sb2.append("\n");
//        }
//        sb2.insert(0,"c++");
//        sb2.deleteCharAt(sb2.length()-1);
//        System.out.println(sb2);
//
//        // StringBuilder : 문자열 조립 객체 (가장 빠름)
//        String st1 = "hello";
//        //StringBuilder는 동시성 이슈 발생 == Thread--Safe 하지 않음
//        StringBuilder sb1 =new StringBuilder();
//        sb1.append("a");
//        //StringBuffer는 동시성 이슈 X == Thread -- safe함
//        StringBuffer sb3 = new StringBuffer();

        String st1 = "hello";
        StringBuilder sb = new StringBuilder();
        for(int i=st1.length()-1; i>=0; i--){
            sb.append(st1.charAt(i));
        }
        System.out.println(sb);
    }
}
