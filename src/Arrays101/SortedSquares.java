package Arrays101;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SortedSquares {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        solution2.sortedSquares();
    }
}

class Solution2 {
    public int[] sortedSquares() {
        int[] A = {-4,-1,0,3,10};
        for (int i=0;i<A.length;i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}