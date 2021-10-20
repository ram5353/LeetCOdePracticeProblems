package Oct19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for (int num : nums1) {
            if (hm1.containsKey(num)) {
                hm1.put(num, hm1.get(num) + 1);
            } else {
                hm1.put(num, 1);
            }
        }

        for (int nums : nums2) {
            if (hm2.containsKey(nums)) {
                hm2.put(nums, hm2.get(nums) + 1);
            } else {
                hm2.put(nums, 1);
            }
        }

        for (Integer key: hm1.keySet()) {
            if (hm2.containsKey(key)) {
                int x = Math.min(hm1.get(key), hm2.get(key));
                while(x-- > 0) {
                    arr.add(key);
                }
            }
        }
        int[] array = arr.stream().mapToInt(i->i).toArray();
        return array;

    }
}
