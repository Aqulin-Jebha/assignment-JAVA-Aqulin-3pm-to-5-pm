interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of Rs." + amount);
    }
}

class UPIPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of Rs." + amount);
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of Rs." + amount);
    }
}

public class EcommercePayment {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new PayPalPayment();

        p1.processPayment(1500);
        p2.processPayment(750);
        p3.processPayment(2000);
    }
}