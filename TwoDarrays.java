import java.util.*;

public class TwoDarrays {

    public static boolean Search(int mat[][], int key) {
        int n = mat.length;
        int m = mat[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == key) {
                    System.out.println("Found at index: "+i+ ", "+j);
                    return true;
                } 
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void largestSmallest(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                max = Math.max(max, mat[i][j]);
                min = Math.min(min, mat[i][j]);
                // if(mat[i][j] > max) {
                //     max = mat[i][j];
                // } 
                // if(mat[i][j] < min) {
                //     min = mat[i][j];
                // } 
            }
        }
        System.out.println("Maximum is: "+max+" Minimum is: "+min);   
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        Search(matrix, 5);
        largestSmallest(matrix);

    }
}
