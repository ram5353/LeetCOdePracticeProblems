package SeptemberChallenge;

import java.util.Arrays;

public class lengthOfLastWord {
    public static void main(String[] args) {
        LastWord l = new LastWord();
        System.out.println(l.lengthOfLastWord());
    }
}

class LastWord {
    public int lengthOfLastWord() {
        String s = "     ";
        if (s.trim().isEmpty()) {
            return 0;
        }
        if (s.length() >= 1) {
            String[] str = s.split(" ");
            return str[str.length - 1].length();
        }
        return 0;
    }
}
