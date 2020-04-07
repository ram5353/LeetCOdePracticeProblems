public class CountingElements {
    public static void main(String[] args) {
        Solution7 obj = new Solution7();
        System.out.println(obj.countElements());
    }
}

class Solution7 {
    public int countElements() {
        int[] arr = {1,1,2,2};
        int count = 0;
        for (int i =0;i< arr.length;i++) {
            for (int j = 0;j < arr.length;j++) {
                if(i != j && arr[i]+1 == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;

    }

}
