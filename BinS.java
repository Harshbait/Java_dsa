import java.util.*;
public class BinS {

    public static int binSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length -1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Wnter num to search");
        int key = sc.nextInt();

        System.out.println("for key: "+key+" Index is: "+binSearch(arr, key));


    }
}
