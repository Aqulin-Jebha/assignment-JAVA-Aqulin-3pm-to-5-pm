public class Product{
int productId;
String productName;
int price;
int quantity;

Product(int id, String n, int p, int q)
{
productId = id;
productName = n;
price = p;
quantity = q;
}

int calculateTotalPrice(){
int total = price * quantity;
System.out.println("Product Id: " + productId);
System.out.println("Product name: " + productName);
System.out.println("Product price : " + price);
System.out.println("Number of items: " + quantity);
System.out.println("Total price is: " + total);
return total;
}

public static void main(String[]args){
Product p1 = new Product(1, "Brush Pen", 199, 2);
p1.calculateTotalPrice();

Product p2 = new Product(1, "Yarn", 28, 5);
p2.calculateTotalPrice();
}
}