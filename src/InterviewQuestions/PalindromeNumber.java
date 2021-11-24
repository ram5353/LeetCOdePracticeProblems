package InterviewQuestions;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int reversedInt = 0;
        int value = x;
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        while (x > 0) {
            reversedInt = reversedInt * 10 + (x % 10);
            x = x / 10;
        }
        System.out.println(reversedInt);
        System.out.println(x);
        if (value == reversedInt) {
            return true;
        } else {
            return false;
        }
    }
}
