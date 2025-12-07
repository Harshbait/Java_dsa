public class Spiral {
    
    public static void printSpiral(int mat[][]) {
        int startRow = 0;
        int endRow = mat.length -1;
        int startCol = 0;
        int endCol = mat[0].length -1;
  
        while(startRow <= endRow && startCol <= endCol) {
            // j for col and i for row

            //This is top boundary
            for(int j = startRow; j <= endCol; j++) {
                System.out.print(mat[startRow][j]+" ");
            }

            // This is right boundary
            for(int i = startRow+1; i <= endRow; i++) {
                System.out.print(mat[i][endCol]+" ");
            }

            // This is bottom boundary
            for(int j = endCol-1; j >= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }

            // This is left boundary
            for(int i = endRow-1; i >= startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
                System.out.print(mat[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;            
        }
    }

    public static void daigonalSum(int mat[][]) {
        int psum = 0;
        int ssum = 0;


        // THIS IS FOR O(n^2)
        // for(int i = 0; i < mat.length; i++) {
        //     for(int j = 0; j < mat[0].length; j++) {
                
        //         //Primary diagonal sum also known as left diagonal
        //         if(i == j) {
        //             psum += mat[i][j];
        //         }
        //         else if(i + j == mat.length-1) {
        //             ssum += mat[i][j];
        //         }
        //     }
        // }
        // System.out.print("Primary diagonal sum: "+psum+" Secondary diagonal sum is: "+ssum);
    
        
        //O(n)
        for(int i =0; i < mat.length; i++) {
            psum += mat[i][i];

            if(i != mat.length-1-i){
                ssum += mat[i][mat.length-i-1];
            }
        }
        System.out.println();
        System.out.print("Primary diagonal sum: "+psum+" Secondary diagonal sum is: "+ssum);;
    
    
    }

    public static void main(String[] args) {

        int mat[][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        printSpiral(mat);
        daigonalSum(mat);
    }
}