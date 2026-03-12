class Payment
{
void processPayment()
{
System.out.println("Processing payment");
}
}

class CreditCardPayment extends Payment{
void processPayment(){
System.out.println("Processing payment using Credit card");
}
}

class DebitCardPayment extends Payment{
void processPayment(){
System.out.println("Processing payment using Debit card");
}
}

class UPIPayment extends Payment{
void processPayment(){
System.out.println("Processing payment using UPI id");
}

}

public class OnlinePaymentSystem {
public static void main(String[] args) {
Payment pay;
pay = new CreditCardPayment();
pay.processPayment();

pay = new DebitCardPayment();
pay.processPayment();

pay = new UPIPayment();
pay.processPayment();
}
}