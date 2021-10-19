package Oct14;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumII(new int[]{3,2,4}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
        for (int i =0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumII(int[] nums, int target) {
        int sum = 0;
        for (int i =0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }
}
