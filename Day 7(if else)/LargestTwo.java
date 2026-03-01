import java.util.*;
public class LargestTwo{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("enter first numb:");
int a = scan.nextInt();

System.out.println("Enter second numb:");
int b = scan.nextInt();

if(a>b){
System.out.println("Larger numb is" + a);
}
else if(b>a){
System.out.println("Largest numb is" +b);
}
else{
System.out.println("Equal");
}
}
}