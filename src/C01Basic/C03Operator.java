package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
                int num1 = 10;
                int num2 = 20;
                boolean b1 = num1 >5 && num2<20;

//                num2 가 10과 30사이에 있는지 여부를 b2에 값 셋팅
        boolean b2 = num2 >=10 && num2<30;
        boolean b3 = !(num2>2 && num2>30);

        //비트 연

//        비트 연산자 : 컴퓨터의 2진 체계에서의 & | ^ << >>
        int n1 = 5; // 1 0 1
        int n2 = 4;
        int n3 = 3; // 0 1 1
        int n4 =1;
        // 두 수를 & 비트 연산 하게 되면 각 자릿수에 모두 1이 있어야 1의 결과값이 나옴


//        System.out.println(n1&n3);
        // 왼쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 x2 한다는 의미
        // 오른쪽으로 1칸 옮기게 되면 해당 숫자값에 /2 하게 되는 것을 의미
        System.out.println(n1<<1);
        System.out.println(n2>>1);
        System.out.println(n4>>1);

//        덧셈을 처리하는 방법 ^ 연산(XOR) 을 수행한 뒤 and연산과 올림수를 밀어버리는 쉬프트 연산을 수행한다.











    }
}
