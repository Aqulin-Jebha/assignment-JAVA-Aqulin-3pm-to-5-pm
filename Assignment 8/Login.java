import java.util.Random;
class LoginSystem{
void login(String username, String password)
{
    System.out.println("Login using Username");
    System.out.println("Username:" + username);
    System.out.println("Password:" + password);
}

void login(String email, String Password, boolean isEmail)
{
    System.out.println("Login using Email");
    System.out.println("Email id:" + email);
    System.out.println("password:" + Password);
}

void login(long mobileNumber)
{
    Random rand = new Random();
    int otp = 1000+rand.nextInt(9000);
    System.out.println("Login using Mobile Number");
    System.out.println("Mobile number:" + mobileNumber);
    System.out.println("your otp:" +otp);
}
}
public class Login{
public static void main(String[]args)
{
    LoginSystem ls = new LoginSystem();
    ls.login("Aqulin","aqulin@abc");
    ls.login("aqulinjebha20", "jebha@77",true);
    ls.login(8665321245L);
}
}
