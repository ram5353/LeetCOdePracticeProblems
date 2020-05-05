import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        Solution8 obj = new Solution8();
        System.out.println(obj.backspaceCompare());
    }
}

class Solution8 {
    public boolean backspaceCompare() {
        String S = "ab#c";
        String T = "ad#c";
        Stack<Character> S1= new Stack<>();
        for (char c: S.toCharArray()) {
            if (c != '#') {
                S1.push(c);
            } else if (!S1.isEmpty()) {
                S1.pop();
            }
        }
        Stack<Character> T1= new Stack<>();
        for (char c: T.toCharArray()) {
            if (c != '#') {
                T1.push(c);
            } else if (!T1.isEmpty()) {
                T1.pop();
            }
        }
        while (!S1.isEmpty()) {
            char current = S1.pop();
            if (T1.isEmpty() || T1.pop() != current) {
                return false;
            }
        }

        return S1.isEmpty() && T1.isEmpty();



    }
}
