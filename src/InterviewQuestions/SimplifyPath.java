package InterviewQuestions;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {
        String[] tokens = path.split("/+");
        Stack<String> stack = new Stack<>();
        for (String s : tokens) {
            if ("..".equals(s) && stack.size() > 0) {
                stack.pop();
            } else if (!Arrays.asList("", ".","..").contains(s)) {
                stack.push(s);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : stack) {
            stringBuilder.append("/").append(s);
        }
        return stringBuilder.length() == 0? "/": stringBuilder.toString();
    }
}
