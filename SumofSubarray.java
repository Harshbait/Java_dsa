public class SumofSubarray {
    public static int printSubarray(int numbers[]) {
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                curr = 0;
                for(int k = start; k <= end; k++) {

                    curr += numbers[k];
                } 
                System.out.println("Current Sum: "+ curr);
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
