import java.util.*;
public class LargestThree{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("enter first numb:");
int a = scan.nextInt();

System.out.println("Enter second numb:");
int b = scan.nextInt();

System.out.println("Enter third numb:");
int c = scan.nextInt();


if(a>b && a>c){
System.out.println("Larger numb is" + a);
}
else if(b>a && b>c){
System.out.println("Largest numb is" +b);
}
else if(c>a && c>b){
System.out.println("Largest numb is" +c);
}
else{
System.out.println("Equal");
}
}
}