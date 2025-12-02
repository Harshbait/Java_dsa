public class SumofPairs {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 4, -1, 2};

        int maxSum = Integer.MIN_VALUE;

        // Brute Force: Try all subarrays
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {

                int sum = 0;

                // calculate sum of subarray arr[i..j]
                for(int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
