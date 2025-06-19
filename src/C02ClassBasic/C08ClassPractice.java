package C02ClassBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C08ClassPractice {
    public static void main(String[] args) {
//        List<Account> userAccount = new ArrayList<>();
//        userAccount.add(new Account("hong1","01234",30000));
//        userAccount.add(new Account("hong2","54321",20000));

            //사용자 1이 사용자2에게 송금
//        for(Account a : userAccount){
//            if(a.getAccountNumber()=="01234"){
//                a.setBalance(a.getBalance()-10000);
//                System.out.println(a.getBalance());
//            }
//            if(a.getAccountNumber()=="54321"){
//                a.setBalance(a.getBalance()+10000);
//                System.out.println(a.getBalance());
//            }
//
//        }
//
//        for(Account a : userAccount){
//            System.out.println("계좌번호 : " + a.getAccountNumber() + " 잔액 : " + a.getBalance());
//
//        }

        // Map을 자료구조로 사용
        Map<String, Account> accountMap = new HashMap<>();
        accountMap.put("12345",new Account("hong1","12345",100000));
        accountMap.put("54321",new Account("hong2","54321",100000));

        Account account1 = accountMap.get("12345");
        Account account2 = accountMap.get("54321");
        account1.setBalance(account1.getBalance()-50000);
        account2.setBalance(account2.getBalance()+50000);

        for(String str : accountMap.keySet()){
            System.out.println(accountMap.get(str).getAccountNumber());
        }

    }
}

class Account{
    private String name;
    private String accountNumber;
    private long balance;

    public Account(String name, String accountNumber, long balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


}
//Account 클래스, 계좌주명, 계좌번호, 잔고
