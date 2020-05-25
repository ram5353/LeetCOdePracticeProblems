package Arrays101;

import java.util.Arrays;

public class DuplicateZeros {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.duplicateZeros();
    }
}

class Solution3 {
    public void duplicateZeros() {
        int[] arr = {1,0,2,3,0,4,5,0};
        for (int i=0;i< arr.length-1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}