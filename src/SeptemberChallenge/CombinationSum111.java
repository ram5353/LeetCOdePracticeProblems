package SeptemberChallenge;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum111 {
    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        System.out.println(obj.combinationSum3(3,9));
    }
}

class CombinationSum {

    List<List<Integer>> output = new ArrayList();
    List<List<Integer>> result = new ArrayList();
    int n;
    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        output.add(new ArrayList(curr));
        for (int i = first; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subset(int[] nums) {
        n = nums.length;
        backtrack(0, new ArrayList<Integer>(), nums);
        return output;
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        subset(nums);
        output.forEach(l -> {
            if (l.size() == k && l.stream().reduce(0, Integer::sum) == n) {
                result.add(l);
            }
        });
        return result;
    }
}
