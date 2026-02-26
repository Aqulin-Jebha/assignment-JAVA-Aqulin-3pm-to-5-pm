import java.util.*;
public class StockItems {
    public static void main(String[] args) {
        String item1 = "pen";
        String item2 = "hairclip";
        String item3 = "Oreo Biscuit";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your item: ");
        String total= scan.nextLine();
        
        if(item1.equals(total) || item2.equals(total) || item3.equals(total)){
            System.out.println("Item is there!");
        }
        else{
            System.out.println("Item not in stack!");
        }
    }
}