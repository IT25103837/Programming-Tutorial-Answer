public class Q4{
    public static void main(String[] args) {

        System.out.println("Using while loop:");
        int row = 0;
        while (row < 5) {
            int col = 0;
            while (col < 5) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }

        System.out.println("\nUsing for loop:");

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
