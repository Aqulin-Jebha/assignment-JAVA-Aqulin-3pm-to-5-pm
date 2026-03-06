public class MobilePhone {
String Model;
int Price;
	
MobilePhone()
{
Model = "Samsung";
Price = 20000;
}
   
public void display()
{
System.out.println("Phone Model:" + Model);
System.out.println("Phone Price:" + Price);
	   
}
	
public static void main(String[] args) {
MobilePhone mp = new MobilePhone();
mp.display();
}
}