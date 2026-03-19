import java.util.Scanner;

public class StoreFiveNumbers {
    public static void main(String[] args) {
        int[]array = new int[5];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 5 numbers");

        for(int i=0;i<5;i++)
        {
            array[i] = scan.nextInt();
        }

       System.out.println("The numbers are");
       for(int i=0;i<5;i++)
       {
        System.out.println(array[i]);
       }
    }
}