import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubSets {
    public static void main(String[] args) {
        Sub obj = new Sub();
        System.out.println(obj.subset(new int[]{4,4,4,1,4}));
        List<List<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        System.out.println(obj.generateSubSetsforDup(0, current, new int[]{4,4,4,1,4}, subsets));
    }
}

class Sub {
    List<List<Integer>> output = new ArrayList();

    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
        output.add(new ArrayList(curr));
        for (int i = first; i < nums.length; i++) {
            curr.add(nums[i]);
            backtrack(i + 1, curr, nums);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> subset(int[] nums) {
        backtrack(0, new ArrayList<Integer>(), nums);
        return output;
    }

    public void generateSubSets(int index, ArrayList<Integer> current, int[] numbers, List<List<Integer>> output) {
        output.add(new ArrayList<>(current));
        for (int i = index; i<numbers.length; i++) {
            current.add(numbers[i]);
            generateSubSets(i + 1, current, numbers, output);
            current.remove(current.size() - 1);
        }
    }

    public List<List<Integer>> generateSubSetsforDup(int index, ArrayList<Integer> current, int[] numbers, List<List<Integer>> output) {
        output.add(new ArrayList<>(current));
        for (int i = index; i<numbers.length; i++) {
            current.add(numbers[i]);
            generateSubSets(i + 1, current, numbers, output);
            current.remove(current.size() - 1);
        }
        return output.stream().distinct().collect(Collectors.toList());
    }
}
