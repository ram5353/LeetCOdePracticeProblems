package InterviewQuestions;

import java.util.Arrays;

public class SubArraySumEqualsK {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3}, 3));
        System.out.println(findSubArraySumValue(new int[]{1,2,3}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        int count = 0;
        if (nums.length == 1 && nums[0] == k) {
            return 1;
        }
        sum[0] = nums[0];
        for (int i = 1; i <= nums.length; i++) {
            sum[i] = sum[i-1] + nums[i-1];
        }
        for (int start =0; start < nums.length; start++) {
            int r = 0;
            for (int end = start + 1; end <= nums.length; end++) {
                r = sum[end] - sum[start];
                if (r == k) {
                    count++;
                }
            }
        }
        return count;
    }

    //brute force
    public static double findSubArraySumValue(int[] nums, int k) {
        double count = 0;
        double sum;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                sum = 0;
                for (int i = start; i < end; i++) {
                    sum += nums[i];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
