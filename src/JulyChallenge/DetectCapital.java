package JulyChallenge;

public class DetectCapital {
    public static void main(String[] args) {
        Capital obj = new Capital();
        System.out.println(obj.detectCapitalUse());

    }
}

class Capital {
    public boolean detectCapitalUse() {
        String str = "USA";
        if (str.length() < 2) return true;
        if (str.toUpperCase().equals(str)) return true;
        if (str.substring(1).toLowerCase().equals(str.substring(1))) return true;
        return false;
    }
}
