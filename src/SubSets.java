import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        Sub obj = new Sub();
        System.out.println(obj.subset(new int[]{1, 2, 3}));
    }
}

class Sub {
    List<List<Integer>> output = new ArrayList();
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
}
