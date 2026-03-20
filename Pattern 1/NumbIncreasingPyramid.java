import java.util.Scanner;

public class NumbIncreasingPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows;

        System.out.println("enter the array size");
        rows = scan.nextInt();

        
        for(int i=1; i<rows; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(j);
            }
        System.out.println();

        }

    }
}
