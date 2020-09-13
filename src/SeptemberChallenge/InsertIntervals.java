package SeptemberChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {
    public static void main(String[] args) {
        insert obj = new insert();
        System.out.println(Arrays.deepToString(obj.insert()));
    }
}

class insert {
    public int[][] insert() {

        int[][] intervals = new int[][]{{1,3},{6,9}};
        int[] newInterval = new int[]{2, 5};
        List<int[]> result = new ArrayList<>();

        for (int[] in: intervals) {
            if (newInterval[0] > in[1]) {
                result.add(in);
            } else if (newInterval[1] < in[0]) {
                result.add(newInterval);
                newInterval = in;
            } else {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        result.add(newInterval);
        return result.toArray(new int[result.size()][2]);
    }
}
