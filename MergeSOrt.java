public class MergeSOrt {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // System.out.println(" a");    
    }

    public static void merger(int arr[], int si, int en) {
        //base case
        if(si >= en) {
            return;
        }

        //kaam
        int mid = si+(en-si)/2;
        merger(arr, si, mid);  //left part
        merger(arr, mid+1, en); //Right part
        mergeIt(arr, si, mid, en);
    }

    
    public static void mergeIt(int arr[], int si, int mid, int en) {
        //left(0, 3) = 4 right(4, 6) = 3 -> 6-0+1 
        // Array indexes is 0 based so we have to do +1
        int temp[] = new int[en - si + 1];
        int i = si;   // iterator for left
        int j = mid+1;  //iterator for right
        int k = 0; //iterator for temp array

        while(i <= mid && j <= en) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= en) {
            temp[k++] = arr[j++];
        }

        //copy temp arr to orignal array
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        merger(arr, 0, arr.length-1);
        printArr(arr);
    }
}