package SeptemberChallenge;

import java.util.ArrayList;
import java.util.List;

public class PartitonLabels {
    public static void main(String[] args) {
        Labels labels = new Labels();
        System.out.println(labels.partitionLabels("ababcbacadefegdehijhklij"));

    }
}

class Labels{
    public List<Integer> partitionLabels(String S) {
        List<Integer> output = new ArrayList<>();
        int[] last = new int[26];
        for (int i =0; i<S.length(); i++ ) {
            last[S.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int j =0; j < S.length(); j++) {
            end = Math.max(end,last[S.charAt(j) - 'a']);
            if (j == end) {
                output.add(end-start + 1);
                start = end + 1;
            }
        }
        return output;
    }
}
