import java.util.*;
public class Employee{
    String empName;
    int empId;
   static int basicSalary; 
void GrossSalary(){
    int HRA = basicSalary* 20/100;
    int DA = basicSalary* 10/100;
    int gross_salary = basicSalary+ HRA+ DA;
    System.out.println(gross_salary);
    
    if(basicSalary>= 50000){
        int bonus = basicSalary*5/100 +basicSalary;
        System.out.println("Eligible for bonus");
    }
    else{
        System.out.println("Not Eligible for bonus");
    }
}

public static void main(String[]args){
    Employee e1 = new Employee();
    e1.empName = "Aqulin";
    e1.empId = 01;
    basicSalary = 50000;
    System.out.println(e1.empId + ","+ e1.empName);
    e1.GrossSalary();
    
    Employee e2 = new Employee();
    e2.empName = "Akshi";
    e2.empId = 02;
    basicSalary = 45000;
     System.out.println(e2.empId + ","+ e2.empName);
    e2.GrossSalary();
    
    Employee e3 = new Employee();
    e3.empName = "Jebha";
    e3.empId = 03;
    basicSalary = 90000;
     System.out.println(e3.empId + ","+ e3.empName);
    e3.GrossSalary();
    

    
} 
    
}