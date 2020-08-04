package JulyChallenge;

public class ValidPlaindrome {
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.validPlaindrome());
    }
}

class Palindrome {

    public boolean validPlaindrome() {
        String str = "A man, a plan, a canal: Panama";
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(str.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(str.charAt(j))) {
                j--;
            }
            if (i < j && Character.toLowerCase(str.charAt(i++)) != Character.toLowerCase(str.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
