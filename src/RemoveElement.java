public class RemoveElement {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {3,2,2,3};
        int val = 3;
        s.removeElement(nums, val);
    }
}

class Solution1 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
