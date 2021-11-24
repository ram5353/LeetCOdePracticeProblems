package InterviewQuestions;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-994));
    }

    public static int reverse(int x) {
        int result = 0;
        boolean isNeg = false;
        if (x < 0) {
            isNeg = true;
            x *= -1;
        }
        while (x > 0) {
            result = result * 10 + (x % 10);
            if(result%10 != x%10) return 0;
            x = x/10;
        }
        return isNeg? result * -1 : result;
    }
}
