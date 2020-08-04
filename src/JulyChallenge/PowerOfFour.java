package JulyChallenge;

public class PowerOfFour {
    public static void main(String[] args) {
        Power obj = new Power();
        System.out.println(obj.isPowerOfFour());
    }
}

class Power {

    public boolean isPowerOfFour() {
        int num = 16;
        if (num == 0) {
            return false;
        }
        while (num != 1) {
            if (num%4 != 0) {
                return false;
            }
            num = num/4;
        }
        return true;
    }
}
