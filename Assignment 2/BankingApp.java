import java.util.*;
class BankAccount{
double accountBalance;

void withdraw(){
double withdrawalAmount = 2000;

if(withdrawalAmount <= accountBalance){
accountBalance = accountBalance - withdrawalAmount;
System.out.println("Withdrawal Successful !");
System.out.println("Remaining Balance: "+ accountBalance);
}
else{
System.out.println("Insufficient Balance!");
}
}
}

public class BankingApp{
public static void main(String[] args){
BankAccount customer1 = new BankAccount();
customer1.accountBalance = 10000;
customer1.withdraw();
}
}