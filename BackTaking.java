public class BackTaking {

    public static void changeArr(int i, int val, int arr[]) {
        // basecase
        if(arr.length == i) {
            printArr(arr);
            return;
        }
        //kaam
        arr[i] = val;
        changeArr(i+1, val+1, arr);
        arr[i] = arr[i] - 2; 
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = new int[5];
        changeArr(0, 1, arr);
        printArr(arr);
    }
}