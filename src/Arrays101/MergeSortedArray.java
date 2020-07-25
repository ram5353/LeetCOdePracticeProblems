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
        int[] nums1 = {0,0,0,0,0,0};
        int[] nums2 = {2,5,6,1,2,3};
        int j = 0;
        int n =3, m =3;
        int l1 = nums2.length;
        int h = 0;
        if (l1 == 0) {
            return;
        } else if (l1 == 1 && nums1.length ==1) {
            nums1[0] = nums2[0];
        }
        for ( j =0;j < nums1.length;j++) {
            if (nums1[j] == 0) {
                break;
            }
        }
        System.out.println(j);
        for (int i = j; i<nums1.length; i++) {
            nums1[i] = nums2[h];
            h++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
