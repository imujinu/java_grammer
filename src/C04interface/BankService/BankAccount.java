package C04interface.BankService;

public class BankAccount {
    private String AccountNumber;
    private long balance;

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void updateBalance(long balance){
        this.balance+=balance;
    }

    public BankAccount(String accountNumber) {
        this.AccountNumber = accountNumber;

    }
}
