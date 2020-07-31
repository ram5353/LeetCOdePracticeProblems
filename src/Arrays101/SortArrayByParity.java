package Arrays101;

import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        Solution7 obj = new Solution7();
        obj.sortArrayByParity();
        obj.sortArrayByParity1();
    }
}

class Solution7 {

    public void sortArrayByParity() {
        int[] A = {3,6,2,4,7,8,0,12};
        int temp = 0;
        for (int i=0; i<A.length-1; i++) {
            if (A[i] % 2 != 0) {
                for (int j=i+1; j<A.length; j++) {
                    if (A[j]%2 == 0) {
                        temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(A));
    }

    public void sortArrayByParity1() {
        int[] A = {3,1,2,4};
        int l = 0;
        int h = A.length - 1;
        while(l < h) {
            if (A[l] % 2 == 1) {
                while(h > l && A[h] % 2 == 1) {
                    h--;
                }
                if(h == l) {
                    System.out.println(Arrays.toString(A));
                }
                int tmp = A[l];
                A[l] = A[h];
                A[h] = tmp;
            }
            l++;
        }
        System.out.println(Arrays.toString(A));
    }
}
