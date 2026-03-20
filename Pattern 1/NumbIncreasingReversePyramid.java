import java.util.Scanner;

public class NumbIncreasingReversePyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows;

        System.out.println("enter the array size");
        rows = scan.nextInt();

        
        for(int i=rows; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
        System.out.println();

        }

    }
}
