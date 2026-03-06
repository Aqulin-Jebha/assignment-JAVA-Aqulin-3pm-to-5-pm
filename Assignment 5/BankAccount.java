import java.util.*;
public class BankAccount{
    String accountHolderName;
    int accountNumber;
    int accountBalance;
 
   void deposit(int depositAmount){
       accountBalance = accountBalance + depositAmount ;
       System.out.println(" Your current balance:"+ accountBalance);
       
   }
   void withdraw(int withdrawalAmount){
       if(withdrawalAmount> accountBalance){
           System.out.println("Insufficient Balance");
       }
       else{
           accountBalance = accountBalance - withdrawalAmount;
           System.out.println("Your Current Balance:" + accountBalance);
       }
   }
   
   void display(){
       System.out.println("Account Holder: " + accountHolderName);
       System.out.println("Account Number: " + accountNumber);
       System.out.println("Account Balance: " + accountBalance);
   }
   
   public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter your deposit amount:");
       int depositAmount = scan.nextInt();
       
       System.out.println("Enter your withdrawal amount:");
       int withdrawalAmount = scan.nextInt();
       
    BankAccount b1 = new BankAccount();
    b1.accountHolderName = "Aqulin";
    b1.accountNumber = 01367;
    b1.accountBalance = 9;
    
    b1.withdraw(withdrawalAmount);
    b1.deposit(depositAmount);
    b1.display();
    
    BankAccount b2 = new BankAccount();
    b2.accountHolderName = "Akshi";
    b2.accountNumber = 987654;
    b2.accountBalance = 200;

    b2.withdraw(withdrawalAmount);
    b2.deposit(depositAmount);
    b2.display();

    
   }
}
    
