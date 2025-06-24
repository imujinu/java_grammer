package C05AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C04StreamApi {
    public static void main(String[] args) {
        // 전통적인 방식의 데이터 접근 방법 : 메모리 주소 접근
        // ex ) 일반 for문

//        int[] arr = {10,20,30};
//        // 함수형 프로그램 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
//        // Stream api : java에서 함수형프로그래밍을 지원하는 라이브러리
//        // foreach : 스트림의 각 요소를 하나씩 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
//        // 스트림의 생성 :.stream()
//        List<String> myList = new ArrayList<>();
//        myList.add("HTML");
//        myList.add("CSS");
//        myList.add("javascript");
//        Stream<String> stream = myList.stream();
//
//        //원시자료형을 위한 stream 객체가 별도로 존재.
//        int[] intArr = {10,20,30,40,50};
//        IntStream intStream = Arrays.stream(intArr);
//
//        //stream의 중계연산(변환) : filter, map, sorted, distinct
//        //filter
//        // sum
//        int total = Arrays.stream(intArr).filter(a->a<=30).sum();
//        System.out.println(total);
//
//        String[] stArr = {"HTML", "CSS","JAVA","PYTHON"};
//
//        // map : 기존의 스트림을 조작하여 새로운 스트림을 반환.
//        int[] intArr2 = {10,20,30,40,50};
//        int[] totla2 = Arrays.stream(intArr2).map((a)->a*10).toArray();
//        System.out.println(Arrays.toString(totla2));
//
//        int[] intArr3 = {10,10,30,40,50};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//        System.out.println(total3);
//
//        int[] intArr4 = {40,50,30,40,50};
//        int[] newArr4 = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(newArr4));
//
//        // mapToInt : Intstream 형태로 변환해주는 amp
//        String[] stArr2 = {"HTML", "CSS","JAVA","PYTHON"};
//        int length = Arrays.stream(stArr2).mapToInt(a->a.length()).sum();
//        // stream까지 하면 Stream 형태로 변환. 거기서 mapToInt로 숫자로 변환 해줘야함.
//        System.out.println(length);
//        int[] arr = {1,2,3,4,5,6};
//        //arr에서 홀수만 담은 배열 생성 후 출력
//        int[] arr1 = Arrays.stream(arr).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(arr1));
//        // arr에서 홀수만 걸러어서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] arr2 = Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(arr2));
//        // arr에서 홀수만 거르고 제곱값을 구하고 해당 숫자값을 오름차순한 순서로 배열을 생성 후 출력
//        int[] arr3 = Arrays.stream(Arrays.stream(arr).filter(a->a%2!=0).map(a->a*a).toArray()).sorted().toArray();
//        System.out.println(Arrays.toString(arr3));
//
//        // 스트림의 소모 : foreach(출력), sum(합계), reduce(누적연산), max, min, count, findFirst : stream의 첫번째 값 리턴
//
//        int[] intArr = { 10,20,30,40,50};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();
//
//        // reduce : 누적연산
//
//        int accSum = Arrays.stream(intArr).reduce(0,(a,b)->a+b);
//        System.out.println(accSum);
//        int accMultiply = Arrays.stream(intArr).reduce(1,(a,b)->a*b);
//        System.out.println(accMultiply);
//        String[] stArr = {"hello","java","world"};
//        String str = Arrays.stream(stArr).reduce("",(a,b)->a+b);
//        System.out.println(str);
//
//        // findFirst : 첫번째 요소 반환
//        String firstSt = Arrays.stream(stArr).filter(a->a.length()>=5).findFirst().get();
//        System.out.println(firstSt);

        // 주의 사항 : 제네릭의 타입 소거
        // 자바의 런타임 시점에 <String> 과 같은 제네릭의 타입소거 발생.
        // toArray를 통해 바로 String 배열을 만드는 ㄳ
        String[] stArr = {"hello","java","world"};
        String[] answer = Arrays.stream(stArr).filter(a->a.length()>=5).toArray(a->new String[a]);
        // 제네릭 타입이 런타임 시점에 소거된다.
        System.out.println(Arrays.toString(answer));
    }
}
