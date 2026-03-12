import java.util.*;
class Student{
String name;
int rollNumber;
void calculateTotal(){
int mark1, mark2, mark3;
int total;
Scanner sc = new Scanner(System.in);
System.out.println("Enter subject marks:");
mark1 = sc.nextInt();
mark2 = sc.nextInt();
mark3 = sc.nextInt();
total = mark1+mark2+mark3;
System.out.println("Total marks = " +total);
}
}

public class StudentManagement{
public static void main(String [] args){
Student s1 = new Student();
s1.name = "Akshi";
s1.rollNumber = 07;
System.out.println("Name:" + s1.name);
System.out.println("Roll Number:"+ s1.rollNumber);
s1.calculateTotal();
}
}