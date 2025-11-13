import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Grid
        for(int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
                // System.out.print(row + ", " + col + " ");
                
            }
            System.out.println("");
        }

        //Grid left
        for(int row = 1; row <= n; row++) {
            for (int col = row; col >= 1; col--) {
                System.out.print("* ");
                // System.out.print(row + ", " + col + " ");
                
            }
            System.out.println("");
        }
    }
}
