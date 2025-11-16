import java.util.*;
public class Linear {

    public static int linearSearch(int num[], int key) {
        for(int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            } 
        }
        return -1;
    }

    public static int largestNumber(int num[]) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++) {
            if(a < num[i]) {
                a = num[i];
            }
            if(b > num[i]) {
                
                b = num[i];
            }
        }
        System.out.println("Smallest number: "+b);
        return a;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number you want to search: ");
        int key = sc.nextInt();

        int index = linearSearch(arr, key);
        if(index == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Index at: " + index);
        }

        int largest = largestNumber(arr);
        System.out.println("Largest nuber is: " + largest);


     }
}
