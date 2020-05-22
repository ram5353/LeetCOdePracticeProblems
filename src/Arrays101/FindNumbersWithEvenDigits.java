package Arrays101;

public class FindNumbersWithEvenDigits {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.findNumbers();
        solution1.findNumberDifferentWay();
    }
}

class Solution1 {
    public void findNumbers() {
        int count = 0;
        int total = 0;
        int[] nums = {555,901,482,1771};
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] >= 1) {
                int numbers = nums[i] / 10;
                nums[i] = numbers;
                count++;
                if (nums[i] < 1) {
                    if (count % 2 == 0) {
                        total++;
                    }
                    count = 0;
                }
            }
        }
        System.out.println(total);
    }

    public void findNumberDifferentWay() {
        int count = 0;
        int[] nums = {555,901,482,1771};
        for (int i=0;i<nums.length;i++) {
            if (String.valueOf(nums[i]).length() %2 ==0) {
                count++;
            }
        }
        System.out.println(count);
    }

    }
