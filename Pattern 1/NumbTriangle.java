public class NumbTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows;

        System.out.println("enter the array size");
        rows = scan.nextInt();


        for(int i = 1; i <= rows; i++) {

            for(int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i-1); j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}