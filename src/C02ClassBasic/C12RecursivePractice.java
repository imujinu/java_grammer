package C02ClassBasic;

public class C12RecursivePractice {
    public static void main(String[] args) {
        int total = sumAcc(1,11);
        System.out.println(total);
        System.out.println(factorial(5));

        // 피보나치 수열 : f(n-1) + f(n-2) = f(n);
        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=1;

        for(int i=2; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[arr.length-1]);

        int n1 =1;
        int n2 =1;
        int n3 =0;
        for(int i=2; i<10; i++){
            n3 = n1+n2;
            n1= n2;
            n2 = n3;
        }
        System.out.println(n3);

        // 풀이 3 : 재귀함수를 이용한 피보나치
        System.out.println(fibonacci(10));

    }

    static int sumAcc(int n, int target){
        if(n==target)return 0;
        return n+sumAcc(n+1, target);
    }

    static int factorial(int n){
        if(n==1) return 1;

        return n*factorial(--n);
    }

   public static int fibonacci(int n){
        if(n<=2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
   }
}
