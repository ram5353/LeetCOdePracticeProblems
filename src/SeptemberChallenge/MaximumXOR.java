package SeptemberChallenge;

import java.lang.invoke.MethodHandles;

public class MaximumXOR {
    public static void main(String[] args) {
        XOR obj = new XOR();
        System.out.println(obj.findMaximumXOR());
    }
}

class XOR {
    public int findMaximumXOR() {
        int[] nums = {3, 10, 5, 25, 2, 8};
        int result = 0;
        if (nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    result = Math.max(result, (nums[i] ^ nums[j]));
                }
            }
            return result;
        }
        return 0;
    }
}
