package Arrays101;

public class ValidMountainArray {
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.validMountainArray());
    }
}

class Solution6 {
    public boolean validMountainArray() {
        int[] A = {0,3,2,1};
        int N = A.length;
        int i = 0;

        // walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
