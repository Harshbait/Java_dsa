public class PrefixSum {
    public static int printSubarray(int numbers[]) {
        int curr = 0;
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        //Prefix logic O(n^2)
        prefix[0] = numbers[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                curr = start == 0 ? prefix[end] : prefix[end] -prefix[start-1];

                if(maxSum < curr) {
                    maxSum = curr;
                }
                if(minSum > curr) {
                    minSum = curr;
                }
            }
        }
        System.out.println("Minium Sum of subarray is: "+minSum);
        return maxSum;
    }

    public static void main(String[] args) {
        int number[] = {1, -2, 6, -1, 3};
        int maxSum = printSubarray(number);
        System.out.println("Max Sum of Sub array: "+ maxSum);
    }
        
}
