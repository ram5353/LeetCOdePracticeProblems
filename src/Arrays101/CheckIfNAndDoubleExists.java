package Arrays101;

import java.util.Arrays;

public class CheckIfNAndDoubleExists {
    public static void main(String[] args) {

        Solution5 solution5 = new Solution5();
        System.out.println(solution5.checkIfExist());
    }

}

class Solution5 {
    public boolean checkIfExist() {
        int[] arr = {0,0};
        System.out.println(Arrays.toString(arr));
        int number = 0;
        for (int item : arr) {
            int count = 0;
            if (item == 0) {
                count++;
                if (count > 1) {
                    return true;
                }
            }
        }
        for (int value : arr) {
            number = value * 2 ;
            for (int v: arr) {
                if (number != 0) {
                    if (v == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
