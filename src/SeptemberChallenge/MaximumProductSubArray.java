package SeptemberChallenge;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        MaxProduct max = new MaxProduct();
        System.out.println(max.maxProduct());
        System.out.println(max.maxSum());
    }
}

class MaxProduct {
    public int maxProduct() {
        int[] nums = {2,3,-2,4};
        int max = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
            max = Math.max(max, product);
            if (product == 0) {
                product = 1;
            }
        }
        product = 1;
        for (int i = nums.length - 1; i >=0; i--) {
            product = product * nums[i];
            max = Math.max(max, product);
            if (product == 0) {
                product = 1;
            }
        }
        return max;
    }

    public int maxSum() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] table = new int[10];
        table[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            table[i] = Math.max(nums[i], nums[i] + table[i-1]);
            max = Math.max(max, table[i]);
        }
        return max;
    }
}
