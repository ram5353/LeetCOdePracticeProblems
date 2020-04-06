import java.util.*;

public class GroupedAnagrams {
    public static void main(String[] args) {
        Solution6 obj = new Solution6();
        System.out.println(obj.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}

class Solution6 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String string: strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(string);
        }
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}
