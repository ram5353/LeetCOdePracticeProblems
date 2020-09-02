package SeptemberChallenge;

public class ContainsDuplicate111 {

    public static void main(String[] args) {
        Duplicates d = new Duplicates();
        System.out.println(d.containsNearbyAlmostDuplicate(1, 2147483647));
    }
}

class Duplicates {

    public boolean containsNearbyAlmostDuplicate(int k, int t) {
        int[] nums = {2147483647, -2147483647};
        for (int i =0; i < nums.length; i++) {
            for (int j =i+1; j < nums.length; j++)  {
                if (Math.abs((long) nums[i] - nums[j]) <= t && j- i <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
