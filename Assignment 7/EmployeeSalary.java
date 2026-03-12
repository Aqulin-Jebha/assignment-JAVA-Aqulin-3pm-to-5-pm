class Employee{
int empId;
String empName;
int salary;

Employee(int Id, String n, int s){
empId = Id;
empName = n;
salary = s;
}
void displayEmployee()
{
System.out.println("Employee Id:" +empId );
System.out.println("Employee name:" +empName );
System.out.println("Employee salary:" +salary );
}
}
public class EmployeeSalary{
public static void main(String[]args){
Employee e1 = new Employee(1,"Aqulin", 50000);
e1.display();

Employee e2 = new Employee(2,"Akshi",70000);
e2.display();

Employee e3 = new Employee(3,"Jebha",80000);
e3.displayEmployee();


        
}
}