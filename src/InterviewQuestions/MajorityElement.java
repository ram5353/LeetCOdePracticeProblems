package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, 1);
            } else {
                map.put(n, map.get(n) + 1);
            }
        }
        System.out.println(map);
        int maxCount = 0;
        int element = 0;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                element = entry.getKey();
            }
        }
        return element;
    }
}
