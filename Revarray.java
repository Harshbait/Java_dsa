import java.util.*;

public class Revarray {

    public static void reverse(int num[]) {
        int first = 0;
        int last = num.length-1;
        

        while(first < last) {
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp; 
            
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num[] = new int[n];

        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        reverse(num);
        for(int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        
    }
}
