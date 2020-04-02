
import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {
    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        System.out.println(obj.isHappy(19));
    }
}

class Solution2 {
    public boolean isHappy(int number) {
        Set<Integer> uniqueNumbersEncounterd = new HashSet<>();

        while (uniqueNumbersEncounterd.add(number))
        {
            int value = 0;
            while (number > 0)
            {
                value += Math.pow(number % 10, 2);
                number /= 10;
            }
            number = value;
        }

        return number == 1;

    }
}