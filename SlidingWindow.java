import java.util.*;
public class SlidingWindow {

    public static void Slide(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <= nums.length - k; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i; j < i+k; j++) {
                max = Math.max(max, nums[j]);
            }
            list.add(max);
        }

        
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        Slide(nums, k);

    }
}