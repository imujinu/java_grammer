package C01Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
//        // List 선언 방법
//        ArrayList<String> myList1 = new ArrayList<>();
//        ArrayList<String> myList2 = new ArrayList<String>();
//
//        // List 선언 방법 2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();
//
//        // 초기값 세팅방법 2. 배열을 리스트로 변환
//
//        String[] arr = {"java","python","c++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();

        // add 메서드 : 리스트에 갑승ㄹ 하나씩 추가하는 메서드 ;
//

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(10);
//        //1. index를 이용한 삭제 2. value를 이용한 삭제( 중복 처리 x)
//        myList.remove(0);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);
//        // clear : 요소 전체 삭제
//        myList.clear();
//        System.out.println(myList);
//
////        indexOf : 특정 값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(20);
//        myList2.add(20);
//        System.out.println(myList2.indexOf(20));
//
////        contains 값이 있는지 없는지 여부를 리턴
//        System.out.println(myList2);

        // 정렬 : 방법 2가지 (Collections 클래스 사용, 객체 사용);
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(2);
//        myList.add(4);
//        myList.add(3);
//        myList.add(51);
//
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////         객체 (ArrayList 클래스 , sort();
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());

        //이중 리스트 : 리스트 안에 리스트
//        [[1,2], [3,4], [5,6]];
        List<List<Integer>> myList = new ArrayList();

        //for문 이용해서 [[],[],[],[]];
        int count =1;

       for(int i=0; i<4; i++){
           myList.add(new ArrayList<>());
           for(int j=0; j<3; j++){
               myList.get(i).add(count);
               count++;
           }
       }
        ;
        System.out.println(myList);
        // 리스트 안에 배열

        List<int[]> list = new ArrayList<>();
        list.add(new int[2]);
        list.get(0)[0]=1;
        list.get(0)[1]=2;
        list.add(new int[3]);
        list.get(1)[0]=1;
        list.get(1)[1]=2;
        list.get(1)[2]=3;
        list.add(new int[]{1,2,3,4});
        for (int i =0; i<list.size(); i++){
            System.out.println(Arrays.toString(list.get(i)));
        }

        for(int[] arr : list){
            System.out.println(Arrays.toString(arr));
        }
        }

}
