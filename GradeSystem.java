import java.util.*;

public class GradeSystem
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your mark:");
int mark = scan.nextInt();

if (mark>=90){
System.out.println("Grade : A");
}
else if(mark>=75){
System.out.println("Grade: B");
}
else if(mark>=65 ){
System.out.println("Grade: C");
}

else if(mark>=45){
System.out.println("Grade:D");
}
else{
System.out.println("Fail");
}
}
}
