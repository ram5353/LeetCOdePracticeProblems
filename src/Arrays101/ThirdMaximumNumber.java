package Arrays101;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution9 obj = new Solution9();
        obj.thirdMax();
    }
}

class Solution9 {
    public void thirdMax() {
        int[] nums = {1,1,2};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        IntStream number = Arrays.stream(nums).distinct();
        int[] result = number.toArray();
        if (result.length >= 3) {
            System.out.println(Arrays.toString(result));
            System.out.println(result[result.length - 3]);
        } else {
            System.out.println(nums[nums.length-1]);
        }
    }
}
