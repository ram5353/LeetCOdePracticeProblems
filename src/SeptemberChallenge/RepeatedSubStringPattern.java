package SeptemberChallenge;

public class RepeatedSubStringPattern {
   public static void main(String[] args) {
       SubString s = new SubString();
       System.out.println(s.repeatedSubstringPattern("abcabcabcabc"));
   }
}

class SubString {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for (int i = l/2; i>=1; i--) {
            if (l%i == 0) {
                int noOfRepeats = l/i;
                String subString = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for (int j =0; j< noOfRepeats; j++) {
                    sb.append(subString);
                }
                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
