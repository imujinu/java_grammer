package C01Basic;

import java.util.*;

public class C07Array {
    public static void main(String[] args) {
        //배열표현식1. 배열 선언 후 할당 방식
        //배열은 반드시 사전에 길이가 결정되어야 함 .
//        int[] arr1 = new int[5];
//        arr1[0] = 10;
//        arr1[1] = 20;
//        arr1[2] = 30;
//        arr1[3] = 40;
//        arr1[4] = 50;
//        //배열표현식 2. 리터럴방식
//        int[] arr2= {10,20,30,40,50};
//        // int 배열의 경우 0으로 초기화 String 배열은 null로 초기화 ;
//
//        //배열 표현식 3
//        int[] arr3 = new int[]{10,20,30,40,50};
//
//        // 배열 표현식3. 예시
//        ArrayList<int[]> list = new ArrayList<>();
//
//        // 배열 표현식 4 : 불가 -> 배열의 길이를 반드시 확정시켜야함.
//        int[] arr4 = new int[5];
//
//        // Arrays.fill : 배열에 모든 값을 변경
//        String[] arr = new String[5];
//        for(int i=0; i<arr.length ; i++){
//            arr[i]="";
//        }
//        Arrays.fill(arr,"");
//
//        // 85,65,90으로 구성된 int 배열을 선언하고, 총합과 평균을 구해보시오.
//        int[] numbers = {85,65,90};
//        int sum =0;
//        int avg = 0;
//        for(int i=0; i<numbers.length; i++){
//            sum+=numbers[i];
//            avg=sum;
//            avg/=i+1;
//        }
//        System.out.println(sum);
//        System.out.println(avg);
//    //배열의 최대값, 최솟값
//
//        int[] arr5= {10,20,30,12,8,7};
////        int max = Integer.MIN_VALUE;
////        int min = Integer.MAX_VALUE;
//        System.out.println(Arrays.stream(arr5).max());
//        System.out.println(Arrays.stream(arr5).min());

        // 배열의 자리 바꾸기
//        int[] arr3 = {20,10,30};
//
//        //배열 뒤집기
//        int[] arr = {10,20,30,40,50};
//        int[] newArr = new int[arr.length];
//
//        for(int i=0; i< newArr.length; i++){
//            newArr[i]= arr[arr.length-1-i];
//        }
//        System.out.println(Arrays.toString(newArr));

//        int[] arr = { 17,12,20,10,15};
//        System.out.println(Arrays.toString(arr));
//        String[] stArr = {"abc","aaa","acb","abb"};
//        Arrays.sort(stArr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(stArr));
//        // 숫자는 내림차순 정렬이 불가능
//        // 원시 자료형은 Comparator 사용 불가능
//
//        //선택 정렬 알고리즘 직접구현
//        for(int i=0; i<arr.length; i++){
//            int min=arr[i];
//            for(int j=i+1; j<arr.length; j++){
//                if(min>arr[j]){
//                    arr[i] = arr[j];
//                    arr[j]= min;
//                    min=arr[i];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        // 조합 문제 : 모두 가기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
//        int[] intArr = {10,20,30,40,50};
//        ArrayList<int[]> result = new ArrayList<>();
//        for(int i =0; i<intArr.length; i++){
//            for(int j=i+1; j<intArr.length; j++){
//                result.add(new int[]{intArr[i],intArr[j]});
//            }
//        }

        // 배열의 중복 제거
        int[] arr = {10,10,20,30,30,40};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        System.out.println(set);





    }
}
