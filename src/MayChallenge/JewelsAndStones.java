package MayChallenge;

public class JewelsAndStones {
    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        System.out.println(obj.numJewelsInStones());
    }
}

class Solution2 {
    public int numJewelsInStones() {
        String J = "aA";
        String S = "aAAbbbb";
        int count =0;
        for (int i=0;i<J.length();i++) {
            for (int j=0; j<S.length();j++) {
                if (J.charAt(i) == S.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
