import java.util.Scanner;

public class SmallNumb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size");
        int length = scan.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter the numbers");

        for(int i = 0; i < length; i++)
        {
            arr[i] = scan.nextInt();
        }

        int smallest = arr[0];
        for(int i = 1; i < length; i++)
        {
            if(arr[i] < smallest)
                smallest = arr[i];
        }

        System.out.println("Smallest number: " + smallest);
    }
}
