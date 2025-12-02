import java.util.*;

public class PrintPairs {

    public static void pairs(int num[]) {

        for(int i =0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {
                System.out.print("("+ num[i] + ", " + num[j]+")");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            
        }

        pairs(num);

    }
}