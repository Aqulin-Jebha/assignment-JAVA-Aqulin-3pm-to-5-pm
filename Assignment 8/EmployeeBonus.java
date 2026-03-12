class Employee
{
int salary;
int bonus;
void calculateBonus()
{
salary = 65000;
bonus = salary* 30/100;
System.out.println("Employee's bonus amount:" + bonus);

}
}

class Manager extends Employee
{
void calculateBonus()
{
salary = 75000;
bonus = salary* 25/100;
System.out.println("Manger's bonus amount:" + bonus);
}
}

class Developer extends Employee
{
void calculateBonus()
{
salary = 45000;
bonus = salary* 25/100;
System.out.println("Developer's bonus amount:" + bonus);

}
}

class Intern extends Employee
{
void calculateBonus()
{
salary = 75000;
bonus = salary* 25/100;
System.out.println("Intern's bonus amount:" + bonus);
}
}

public class EmployeeBonus{

public static void main(String[]args)
{
Employee emp = new Employee();
Employee m = new Manager();
Employee dev = new Developer();
Employee i = new Intern();

emp.calculateBonus();
m.calculateBonus();
dev.calculateBonus();
i.calculateBonus();
}
}