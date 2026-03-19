import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter the array size");
        int length = scan.nextInt();

        int[]array = new int[length];
        System.out.println("Enter the numbers");
        
        for(int i=0;i<length;i++)
        {
            array[i] = scan.nextInt();
        }

        for(int i=0;i<length;i++)
        {
            sum = sum+array[i];
        }

        System.out.println("sum of array elements:" +sum);

    }
}
