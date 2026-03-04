import java.util.*;
public class CountusingWhile{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number:");
int num = scan.nextInt();
int count = 0;

while(num != 0){
num = num/10;
count++;
}
System.out.println("Total number of digits = " + count);
}
}