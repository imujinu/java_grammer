package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C03Class {
    public static void main(String[] args) {
        MyCalculatorInstance mi1 = new MyCalculatorInstance();
        MyCalculatorInstance mi2 = new MyCalculatorInstance();

        System.out.println(MyCalculatorInstance.totalCount);

        // 자료구조에서 객체 사용 예시
        // 배열
        String[] arr1 = {"hello", "java", "python"};
        Arrays.sort(arr1);
        List<String> arr = Arrays.asList(arr1);
        System.out.println(arr);
        System.out.println(arr1.length);

        //리스트
        List<String> list = new ArrayList<>();
        list.sort(Comparator.naturalOrder());

    }
}
     class MuCalculator{
        public static int sum(int a, int b){
            return a+b;
        }

        //static이 붙어있으면 클래스변수 안붙어잇으면 객체 변수
         // 객체를 생성하고 사용해야 함.
         static int sum =0;

        public static int sumAcc(int a){
            sum+=a;
            return sum;
        }
    }

    class MyCalculatorInstance{
    //클래스를 만들면 아래와 같이 클래스 명을 가진 생성자가 자동으로 만들어짐.
    // 생성자의 주 된 목적은 객체 변수를 초기화 하기 위함이다.
    int total =0;
    static int totalCount = 0;
    public MyCalculatorInstance(){
        totalCount++;
    }

    // 클래스 메서드는 객체의 상태와 상관없는 독립적인 로직 수행시에
    public static int sum(int a, int b){
            return a+b;
        }



        //static이 붙어있으면 클래스변수 안붙어잇으면 객체 변수
        // 객체를 생성하고 사용해야 함.
        // 클래스 변수는 모든 인스턴스 간에 상태 공유 목적으로 사용



        public void sumAcc(int total){
            //this는 객체 자신을 의미
            // 일반적으로, 매개변수와 객체변수를 구분 짓기 위해 사용 (ex) 매개변수도 total, 객체변수명도 total일 경우
            this.total+=total;
        }
    }
