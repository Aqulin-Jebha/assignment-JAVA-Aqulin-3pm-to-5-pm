abstract class Account{
    abstract void calculateInterest();
}

class SavingsAccount extends Account
{
    void calculateInterest()
    {
        int balance=30000;
        int interest = balance*20/100;
        System.out.println("Interest amount for saving account is" + interest);
    }
}

class CurrentAccount extends Account
{
    void calculateInterest()
    {
        int balance = 45999;
        int interest = balance*15/100;
        System.out.println("Interest amount for current account is" + interest);
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        a1.calculateInterest();

        Account a2 = new CurrentAccount();
        a2.calculateInterest();
    }
}
