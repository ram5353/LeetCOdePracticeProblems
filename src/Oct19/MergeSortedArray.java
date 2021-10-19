package Oct19;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int i = m ; i < m+n; i++){
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);
    }
}
