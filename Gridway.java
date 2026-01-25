public class Gridway {

    public static int gridWays(int i, int j, int x, int y) {
        // Base case
        if(i == x-1 && j == y-1) {
            return 1;
        } else if(i == x || j == y) {  // Corner case Boundary cross condition
            return 0;
        }

        int way1 = gridWays(i+1, j, x, y);
        int way2 = gridWays(i, j+1, x, y);

        return way1 + way2;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        System.out.println(gridWays(0, 0, x, y));
    }
}
