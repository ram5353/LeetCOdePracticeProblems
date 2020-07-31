package Arrays101;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementsOnRight {

    public static void main(String[] args) {
        Solution8 obj = new Solution8();
        obj.replaceElements();
    }
}

class Solution8 {
    public void replaceElements() {
        int[] arr = {17,18,5,4,6,1};
        int largest;
        for (int i=0;i<arr.length;i++) {
            largest = 0;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] > largest) {
                    largest = arr[j];
                }
            }
            arr[i] = largest;
        }
        arr[arr.length-1] = -1;
        System.out.println(Arrays.toString(arr));
    }
}
