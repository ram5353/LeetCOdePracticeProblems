import java.util.ArrayList;
import java.util.List;

public class SubSets {
}

class Sub {
    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {

        List<List<Integer>> output = new ArrayList();
        int n;
        output.add(new ArrayList(curr));

        for (int i = first; i < nums.length; i++) {
            // add i into the current combination
            curr.add(nums[i]);
            // use next integers to complete the combination
            backtrack(i + 1, curr, nums);
            // backtrack
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        backtrack(0, new ArrayList<Integer>(), nums);
        return output;
    }
}
