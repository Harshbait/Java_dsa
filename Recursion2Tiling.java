public class Recursion2Tiling {
    public static int tilingProblem(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }   
        //kaam
        //vertical choice
        int verticalTiles = tilingProblem(n-1);

        int horizantalTiles = tilingProblem(n-2);

        int totalTiles = verticalTiles + horizantalTiles;
        return totalTiles;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
