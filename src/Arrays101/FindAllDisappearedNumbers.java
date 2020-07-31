package Arrays101;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        Solution10 obj = new Solution10();
        obj.findDisappearedNumbers();
    }
}

class Solution10 {
    public void findDisappearedNumbers() {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = IntStream.of(nums).boxed().distinct().sorted(Integer::compareTo).collect(Collectors.toList());
        if (list.size() > 0) {
            int count = list.get(list.size() - 1);
            System.out.println(count);
            while (count > 0) {
                if (list.contains(count)) {
                    list.remove((Integer) count);
                } else {
                    list.add(count);
                }
                count--;
            }
        }
        list.sort(Integer::compareTo);
        System.out.println(list);
    }
}
