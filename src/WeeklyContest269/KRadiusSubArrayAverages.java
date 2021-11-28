package WeeklyContest269;

import java.util.Arrays;

public class KRadiusSubArrayAverages {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getAverages(new int[]{7,4,3,9,1,8,5,2,6}, 3)));
    }

    public static int[] getAverages(int[] nums, int k) {
        if(k == 0)
            return nums;
        int N = nums.length;
        long[] sum = new long[N];
        sum[0] = nums[0];
        for(int i = 1; i < N; i++)
            sum[i] = sum[i-1]+nums[i];
        System.out.println(Arrays.toString(sum));
        return null;
    }
}
