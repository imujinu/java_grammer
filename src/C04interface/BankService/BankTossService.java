package C04interface.BankService;

public class BankTossService implements BankService{
    @Override
    public void deposit(long money, BankAccount ba) {

    }

    @Override
    public boolean withdraw(long money, BankAccount ba) {
        return false;
    }
}
