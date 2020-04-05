import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        Solution4 obj = new Solution4();
        obj.moveZeros();

    }
}

class Solution4 {
    public void moveZeros() {
        int[] nums = {0,1,0,3,12};
        int count = 0;
        for (int i =0; i< nums.length;i++) {
            if (nums[i] != 0) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        for (int n : nums) {
            System.out.print(n + "  ");
            System.out.print("\n");
        }


    }
}