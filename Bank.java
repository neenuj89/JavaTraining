
public class Bank{
    public static void main(String[] args) {
        float balance=0;
        Account acc1 =new Account();
        Account acc2= new Account("account2",100);
        acc1.deposit(100);
        acc1.balanceCheck();
        acc1.withdrawAmount(50);
        acc1.accountType();
        Account.accountType();
        acc2.balanceCheck();


    }
}
