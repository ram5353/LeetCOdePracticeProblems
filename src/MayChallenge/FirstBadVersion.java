package MayChallenge;

public class FirstBadVersion {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        s.firstBadVersion(5);

    }
}

class Solution1 {
    public boolean isBadVersion(int number) {
        return true;
    }

    //Binary serach
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        while (left< right) {
            int mid = left + (right-left)/2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid -1;
            }
        }
        return left;
    }
}
