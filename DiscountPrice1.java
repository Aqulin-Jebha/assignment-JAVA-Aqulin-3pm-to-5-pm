import java.util.*;

public class DiscountPrice1
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your product 1:");
String product1 = scan.nextLine();
System.out.println("Enter the Product price:");
int pro_price1 = scan.nextInt();
scan.nextLine();
System.out.println("Enter your product 2:");
String product2 = scan.nextLine();
System.out.println("Enter the product price:");
int pro_price2 = scan.nextInt();
scan.nextLine();
int total = pro_price1 + pro_price2;
System.out.println("Total Price:" + total);

if (total>=5000){
          int discount = total* 25/100;
         int pay = total - discount;
         }
else{
    System.out.println("Not Eligible for Discount");
}
System.out.println("Discount amount is:" + discount);
System.out.println("Amount to pay:" + pay);
}
}