import java.util.*;

public class Login
{
public static void main (String args[])
{
String user = "aqulin";
String password = "aqulin@123";

Scanner scan = new Scanner(System.in);
System.out.println("Enter Username:");
String username1 = scan.nextLine();

System.out.println("Enter Password");
String Password1 = scan.nextLine();

if(user .equals( username1) && password.equals( Password1) ){
System.out.println("Login Successfully!");
}
else{
System.out.println("Incorrect password or username");
}

}
}