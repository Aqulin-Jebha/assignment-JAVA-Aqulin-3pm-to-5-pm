import java.util.*;
public class BankAccount{
int accountNumber;
String accountHolderName;
int balance;

BankAccount(int a, String n, int b){
accountNumber = a;
accountHolderName = n;
balance = b;
}

void deposit(double amount)
{
balance = balance + (int)amount;
}

void displayBalance(){
 System.out.println("Account Number: " + accountNumber);
 System.out.println("Account Holder: " + accountHolderName);
 System.out.println("Current account balance: " + balance);
}
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter your deposit amount:");
double amount = scan.nextDouble();

BankAccount b1 = new BankAccount(1234, "Aqulin", 87);
b1.deposit(amount);
b1.displayBalance();
}
}