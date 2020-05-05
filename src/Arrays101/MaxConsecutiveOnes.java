package Arrays101;


public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        int localMax = 0;
        int globalMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                localMax++;
            } else {
                localMax = 0;
            }
            globalMax = Math.max(globalMax, localMax);
        }
        System.out.println(globalMax);
    }
}
