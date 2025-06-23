package C04interface.BankService;

public class BankKakaoService implements BankService{

    @Override
    public void deposit(long money, BankAccount ba){
        ba.updateBalance(money);
    };
    @Override
    public boolean withdraw(long money, BankAccount ba ){
        //현재 얼마 있는지 조회 && 출금금액과 비교
        if (ba.getBalance()<money){
            return false;
        }else{
            ba.updateBalance(-money);
            return true;
        }
    };
}
