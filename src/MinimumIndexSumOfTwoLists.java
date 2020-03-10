import java.util.*;

public class MinimumIndexSumOfTwoLists {

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        Map<Integer, List<String>> map = new HashMap<>();
        int leastcount;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j))
                        map.put(i + j, new ArrayList < String > ());
                    map.get(i + j).add(list1[i]);
                }
            }
        }

        int minimum = Integer.MAX_VALUE;
        for (int key: map.keySet()) {
            minimum = Math.min(minimum, key);
        }
        String[] res = new String[map.get(minimum).size()];
        System.out.println(Arrays.toString(map.get(minimum).toArray(res)));




    }
}
