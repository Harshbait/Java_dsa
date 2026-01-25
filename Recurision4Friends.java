public class Recurision4Friends {

    public static int friendsPair(int n) {

        if(n == 1 || n == 2) {
            return n;
        }

        //single
        int fnm1 = friendsPair(n-1);

        //pair
        int fnm2 = friendsPair(n-2);
        int pairsWay = (n-1) * fnm2;

        //Total
        int totalWays = fnm1 + pairsWay;
        return totalWays;

    }

    public static void main(String args[]) {
        System.out.println(friendsPair(3));
    }
}
