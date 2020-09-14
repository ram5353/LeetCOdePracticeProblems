package SeptemberChallenge;

public class HouseRobber {
    public static void main(String[] args) {
        Robber obj = new Robber();
        System.out.println(obj.rob());
    }
}

class Robber {
    public int rob() {
        int[] nums = {1,100,3};
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length  + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 1 ; i < nums.length;i++) {
            dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
        }
        return dp[nums.length];
    }
}
