package December2021Challenge;

public class HouseRobber {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1}));
        System.out.println(robII(new int[]{2,7,9,3,1}));
        int[] nums = new int[]{2,7,9,3,1};
        System.out.println(Math.max(houseRobII(nums, 0, nums.length - 1), houseRobII(nums, 1, nums.length)));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[nums.length - 1];
    }

    public static int robII(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp1 = new int[nums.length - 1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + nums[i]);
        }
        int[] dp2 = new int[nums.length - 1];
        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < nums.length - 1; i++) {
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + nums[i + 1]);
        }
        return Math.max(dp1[dp1.length - 1], dp2[dp2.length - 1]);
    }

    //Easy Solution
    public static int houseRobII(int[] nums, int start, int end) {
        int prevTwo = 0;
        int prevOne = 0;
        int max = 0;
        for (int i = start; i < end; i++) {
            max = Math.max(prevTwo + nums[i], prevOne);
            prevTwo = prevOne;
            prevOne = max;
        }
        return max;
    }
}
