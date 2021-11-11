package Oct14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (map.containsKey(s)){
                return new int[] {map.get(s), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
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
