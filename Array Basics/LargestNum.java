import java.util.Scanner;
public class LargestNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array size");
        int length = scan.nextInt();

        int[]array = new int[length];
        System.out.println("enter array elements");

        for(int i=0; i<length; i++)
        {
            array[i]=scan.nextInt();
        }

        int largest = array[0];
        for(int i=0; i<length; i++)
        {
            if(array[i]> largest);
            largest = array[i];
        }
        System.out.println("largest number is" +largest);
        
    }
}
