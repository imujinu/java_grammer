package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
        // 2중 for문을 활용하여 helloworld 출력
        // 위 for문의 반복횟수는 동적으로 결정되지 않고, 정적으로 코딩할 수밖에 없는 한계가 존재.

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);

//        List<List<Integer>> doubleList = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//            for(int j=i+1; j<myList.size(); j++){
//               ArrayList<Integer> list = new ArrayList<>();
//               int num1 = myList.get(i);
//               int num2 = myList.get(j);
//               list.add(num1);
//               list.add(num2);
//               doubleList.add(list);
//            }
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
        //재귀함수를 만듣기 위한 for문 변형
//        List<List<Integer>> doubleList = new ArrayList<>();
//               ArrayList<Integer> list = new ArrayList<>();
//        for(int i=0; i<myList.size()-1; i++){
//               list.add(myList.get(i)) ;
//            for(int j=i+1; j<myList.size(); j++){
//               list.add(myList.get(j));
//               doubleList.add(list);
//            }
//        }
//
//        combi(myList,new ArrayList<>(), doubleList,3,0);
//        System.out.println(doubleList);

        //1234를 n개씩 뽑은 순열 구하기
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        List<List<Integer>> doubleList = new ArrayList<>();
        visited = new boolean[myList.size()];
        permu(myList,new ArrayList<>(), doubleList,2);
        System.out.println(doubleList);


    }
//    static void forRecur(int num, int target){
//        if(num==target){
//            return;
//        }
//
//        for(int i=0; i<3; i++){
//            System.out.println(i);
//            forRecur(num+1,target);
//        }
//
//    }
//
//    static void combi(List<Integer> myList,List<Integer> temp, List<List<Integer>> doubleList, int target, int start){
//        if(temp.size()==target){
//            doubleList.add(new ArrayList<>(temp));
//            // 객체는 주소값을 참고하기 때문에 새로운 객체를 만들며 넘겨주어야 한다.
//            return;
//        }
//        for(int i=start; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            combi(myList,temp, doubleList,target, i+1);
//            temp.remove(temp.size()-1);
//        }
//    }

    static boolean[] visited;
    static void permu(List<Integer> myList,List<Integer> temp, List<List<Integer>> doubleList, int target){
        if(temp.size()==target){
            doubleList.add(new ArrayList<>(temp));
            // 객체는 주소값을 참고하기 때문에 새로운 객체를 만들며 넘겨주어야 한다.
            return;
        }
        for(int i=0; i<myList.size(); i++){
            if(!visited[i]){
                visited[i]=true;
            temp.add(myList.get(i));
            permu(myList,temp, doubleList,target);
            temp.remove(temp.size()-1);
            visited[i]=false;
            }
        }
    }
}
