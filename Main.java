import java.util.*;

public class Main {
    
    public static int linerSerch(int arr[], int key) {
        
        for(int i = 0; i < arr.length; i++) {
            if(key == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Wnter num to search");
        int key = sc.nextInt();
        
        System.out.println("for key: "+key+" Index is: "+linerSerch(arr, key));
        
    }
}













