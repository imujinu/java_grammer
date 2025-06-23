package C04interface.BankService;

import java.util.Scanner;

public class BankController extends BankServiceOriginal {
    public static void main(String[] args) {
        System.out.println("계좌번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        String accountNumber = sc.nextLine();
        BankAccount ba = new BankAccount(accountNumber);
        BankService bc = null;
        while(true){
            System.out.println("입급하시려면 1번, 출금하시려면 2번");
            String serviceNumber = sc.nextLine();
            if(serviceNumber.equals("1")){
                System.out.println("입금방식을 선택해주세요 1. 카카오페이 2. 토스페이");
                int num = Integer.parseInt(sc.nextLine());
                if(num==1){
                    bc = new BankKakaoService();
                }else{
                    bc = new BankTossService();
                }
                System.out.println("입금하실 금액을 입력해주세요");
                long money = Long.parseLong(sc.nextLine());
//                서비스계층이 있다면,
               bc.deposit(money,ba);
                System.out.println("현재 잔액은 : " + ba.getBalance());
            }
            if(serviceNumber.equals("2")){
                System.out.println("출금 방식을 선택해주세요 1. 카카오페이 2. 토스페이");
                int num = Integer.parseInt(sc.nextLine());
                if(num==1){
                    bc = new BankKakaoService();
                }else{
                    bc = new BankTossService();
                }
                long money = Long.parseLong(sc.nextLine());
                boolean check =  bc.withdraw(money, ba);
                if(check){
                    System.out.println("현재 잔액은 : " + ba.getBalance());
                }else {
                    System.out.println("잔액이 부족합니다.");
                }
            }
        }


    }
}
