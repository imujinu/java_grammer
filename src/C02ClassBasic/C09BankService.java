package C02ClassBasic;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//        계좌개설 및 입출금 서비스 : id(auto_increment), accountNumber(String), balance(int).
//        주의사항1 : main메서드에서 입출력 처리를 하고, deposit, withdraw, transfer 메서드는 BankAccount클래스에 생성.
//        주의사항2 : 프로그램은 항상 실행될수 있도록 전체코드를 while(true)처리
//        서비스번호를 입력하세요. 1.개설 2.조회 3.입금 4.출금 5.송금
//        1.계좌개설 : 계좌번호와 현재가지고 계신돈을 입력하세요. -> 자동으로 id값 증가되어 세팅
//        2.계좌조회 : 계좌조회서비스입니다. 계좌번호를 입력해주세요. -> 잔고출력
//        3.입금 : 계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요. -> 현재 계좌에 얼마가 있습니다. 출력.
//        4.출금 : 계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.(잔액검증) -> 남은 금액은 얼마입니다. 출력.
//        5.송금 : 송금서비스입니다. 본인의 계좌번호를 입력해주세요. 보내고자 하는 상대방의 계좌번호를 입력해주세요. 송금금액을 입력해주세요.(잔액검증)
public class C09BankService {

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        Map<Integer, BankAccount> accountList = new HashMap<>();
        while(true){
        int order = sc.nextInt();
        sc.nextLine();
        switch (order){
            case 1 :
                System.out.println("계좌번호와 현재 가지고 계신 돈을 입력하세요");
                String accountNumber = sc.nextLine();
                int balance = sc.nextInt();
                BankAccount bankAccount = new BankAccount(accountNumber,balance);
                accountList.put(bankAccount.getId(), bankAccount );
                System.out.println("계좌 개설이 완료되었습니다.");
                break;
            case 2 :
                System.out.println("계좌조회서비스입니다. 계좌번호를 입력해주세요.");
                String accountNumber2 = sc.nextLine();
                boolean check = false;
                for(Integer al : accountList.keySet()){
                   if(accountList.get(al).getAccountNumber().equals(accountNumber2)){
                       check = true;
                       BankAccount ba = accountList.get(al);
                       System.out.println("현재 잔고는 " + ba.getBalance()+"원 입니다.");

                   }
                }
                if(!check){
                    System.out.println("존재하지 않는 계좌 번호 입니다.");
                }

                break;
            case 3 :
                System.out.println("계좌입금서비스입니다. 계좌번호와 입금금액을 입력해주세요.");
                String accountNumber3 = sc.nextLine();
                long money = sc.nextInt();
                boolean check2 = false;
                for(Integer al : accountList.keySet()){
                    if(accountList.get(al).getAccountNumber().equals(accountNumber3)){
                        check2=true;
                        BankAccount ba = accountList.get(al);
                        ba.setBalance(ba.getBalance()+money);
                        System.out.println("현재 잔고는 : " + ba.getBalance() + " 원 입니다.");
                    }

                }
                if(!check2){
                    System.out.println("존재하지 않는 계좌 번호 입니다.");
                }
                break;
            case 4 :
                System.out.println("계좌출금서비스입니다. 계좌번호와 출금금액을 입력해주세요.");
                String accountNumber4 = sc.nextLine();
                long money2 = sc.nextInt();
                boolean check3 = false;
                for(Integer al : accountList.keySet()){
                    if(accountList.get(al).getAccountNumber().equals(accountNumber4)){
                        check3= true;
                        BankAccount ba = accountList.get(al);
                        if(ba.withdraw(money2)) {
                            System.out.println("출금이 완료되었습니다.");
                            System.out.println("남은 잔액은"+ba.getBalance()+"원 입니다.");
                        }
                        else{
                            System.out.println("잔액이 부족합니다.");
                        }
                }
                    }if(!check3){
                        System.out.println("존재하지 않는 계좌 번호 입니다.");
                    }
                break;
            case 5 :
                System.out.println("송금서비스입니다. 본인의 계좌번호와 금액, 보내고자 하는 상대방의 계좌번호를 입력해주세요.");
                String accountNumber5 = sc.nextLine();
                long money3 = sc.nextInt();
                sc.nextLine();
                String targetNumber = sc.nextLine();
                boolean check4 = false;
                boolean check5 = false;

                for(Integer al : accountList.keySet()){
                    if(accountList.get(al).getAccountNumber().equals(accountNumber5)){
                        check4= true;
                        BankAccount ba = accountList.get(al);

                        for(Integer al2 : accountList.keySet()){
                            if(accountList.get(al2).getAccountNumber().equals(targetNumber)){
                                check5 = true;
                                BankAccount ta = accountList.get(al2);
                                System.out.println(ba.transfer(money3,ta));
                            }

                        }

                    }if(!check4 || !check5){
                        System.out.println("존재하지 않는 계좌 번호 입니다.");
                    }
                }
                break;
            case 6:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못된 명령입니다. 다시 입력해 주세요");
                break;
        }

        }
    }
}
class BankAccount{
    public static int number=1;
    private int id;
    private String accountNumber;
    private long balance;

    public void deposit(long money){
        this.balance+=money;
    }

    public boolean withdraw(long money){
        if(money>this.balance){
            return false;
        }else{
            this.balance-=money;
            return true;
        }
    }

    public String transfer(long money, BankAccount targetAccount){
        if(this.withdraw(money)){
            targetAccount.deposit(money);
            return "송금이 완료되었습니다.";
        }else{
            return "송금에 실패했습니다.";

        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, long balance){
        this.id=number++;
        this.accountNumber = accountNumber;
        this. balance = balance;
    }

}