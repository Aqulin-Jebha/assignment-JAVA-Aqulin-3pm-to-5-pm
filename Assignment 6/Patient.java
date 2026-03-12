import java.util.*;
class Patient{
    int cardNumb;
    String patientName;
    int BillAmount;
    
    void Discount(int BillAmount){
        if(BillAmount>2000){
            int discounts = BillAmount * 25/100 +BillAmount;
            System.out.println("ur bill amount is" + discounts);
        }   
        }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        Patient p1 = new Patient();
        p1.patientName = scan.nextLine();
        p1.cardNumb = scan.nextInt();
        p1.BillAmount = scan.nextInt();
        
        p1.Discount(p1.BillAmount);
        
    }
}