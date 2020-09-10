package SeptemberChallenge;
public class BullsAndCows {

    public static void main(String[] args) {
        Bulls b = new Bulls();
        System.out.println(b.getHint());
    }
}

class Bulls {
    public String getHint() {
        String secret = "1123";
        String guess = "0111";
        int s[] = new int[10];
        int g[] = new int[10];
        int bull = 0;
        int cow = 0;
        for(int i=0;i<secret.length();i++) {
            char cs = secret.charAt(i);
            char cg = guess.charAt(i);
            if(cs==cg) {
                bull++;
            } else {
                s[cs-'0']++;
                g[cg-'0']++;
            }
        }
        for(int i=0;i<g.length;i++) {
            cow += Math.min(s[i],g[i]);
        }
        return bull+"A"+cow+"B";
    }
}
