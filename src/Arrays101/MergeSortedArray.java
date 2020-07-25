package Arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        solution4.merge();
    }
}

class Solution4 {

    public void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            int one = nums1[i];
            int two = nums2[j];
            if(one >= two){
                nums1[k] = one;
                k--;
                i--;
            }else{
                nums1[k] = two;
                k--;
                j--;
            }
        }
        while(i >= 0){
            nums1[k--] = nums1[i--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
