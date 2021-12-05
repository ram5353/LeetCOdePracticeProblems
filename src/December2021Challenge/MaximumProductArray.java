package December2021Challenge;

import java.util.Arrays;

public class MaximumProductArray {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2, 3, -4}));
        System.out.println(maxProductDP(new int[]{-1,-2,-9,-6}));
    }


    //Brute Force
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int r = 1;
            for (int j = i; j < nums.length; j++) {
                r = r * nums[j];
                max = Math.max(max, r);
            }
        }
        return max;
    }

    //Dynamic Programming
    public static int maxProductDP(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int result = max_so_far;
        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int temp = Math.max(current, Math.max(max_so_far * current, min_so_far * current));
            min_so_far = Math.min(current, Math.min(max_so_far * current, min_so_far * current));
            max_so_far = temp;
            result = Math.max(max_so_far, result);
        }
        return result;
    }

}
