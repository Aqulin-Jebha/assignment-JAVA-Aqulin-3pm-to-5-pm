public class Student{
int studentId;
String studentName;
int marks;

Student(int s, String n, int m)
{
studentId = s;
studentName = n;
marks = m;
}
void calculateGrade()
{
String grade;
if(marks >= 90){
grade = "A";
}
else if(marks >= 75){
grade = "B";
}
else if(marks >= 50){
grade = "C";
}
else{
grade = "Fail";
}
System.out.println("Grade: " + grade);
}

public static void main(String[]args){
Student s1 = new Student(1,"Abika",89);
s1.calculateGrade();

Student s2 = new Student(2,"Akshi",61);
s2.calculateGrade();

}
}