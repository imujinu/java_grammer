package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C11RecursiveBasic {
    public static void main(String[] args) {
    recur0(0, 3);
    recur2(new ArrayList<>(), 0, 3);
    }

    public static void recur0(int count, int target){
        if(count==target){
            return;
        }
        System.out.println("재귀 호출전 count :  "+ count);
        recur0(count+=1, target);
        System.out.println("재귀 호출후 count :  "+ count);
    }

    //출력순서 0 1 2 3 2 1
    public static void recur1(int count, int target){
        if(count==target){
            return;
        }
        System.out.println("재귀 호출전 count :  "+ count);
        count += 1;
        recur1(count, target);
        System.out.println("재귀 호출후 count :  "+ count);
    }

    public static void recur2(List<Integer> list, int num, int target){
        if(list.size()==target){
            return;
        }
        list.add(num);
        recur2(list, num+1, target);
        //0,1,2 0,1,2 0,1,2
        System.out.println(list);
    }
}
