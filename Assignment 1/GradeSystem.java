import java.util.*;

public class GradeSystem
{
public static void main(String args[])
{
Scanner scan = new Scanner(System.in);
System.out.println("Enter your mark:");
int mark = scan.nextInt();
String Grade="";

if (mark>=90){
Grade = "A";
}
else if(mark>=75){
Grade = "B";
}
else if(mark>=65 ){
Grade = "C";
}

else if(mark>=45){
Grade = "D";
}
else{
Grade = "Fail";
}
System.out.println("Grade" + Grade);
}
}
