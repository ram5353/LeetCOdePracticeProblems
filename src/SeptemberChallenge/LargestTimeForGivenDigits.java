package SeptemberChallenge;


public class LargestTimeForGivenDigits {

    public static void main(String[] args) {
        LargestTime l = new LargestTime();
        System.out.println(l.largestTimeFromDigits());
    }
}

class LargestTime {

    public String largestTimeFromDigits() {
        int[] A = {1,2,3,4};
        String ans = "";
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                for(int k=0;k<A.length;k++){
                    if(i==j||i==k||j==k){
                        continue;
                    }
                    int l = 6-i-j-k;
                    String h = ""+A[i]+A[j];
                    String m = ""+A[k]+A[l];
                    String t = h+":"+m;
                    if(h.compareTo("24")<0&&m.compareTo("60")<0&&t.compareTo(ans)>0){
                        ans = t;
                    }
                }
            }
        }

        return ans;
    }
}
