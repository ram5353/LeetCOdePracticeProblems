package Oct14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ContainsDuplicates {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3}));
    }

    public static boolean containsDuplicate(int[] nums) {
        List<Integer> list = IntStream.of(nums).boxed().distinct().collect(Collectors.toList());
        return list.size() != nums.length;
    }
}
