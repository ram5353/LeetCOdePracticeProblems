package WeeklyContest269;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndices {

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 3));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i =0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
