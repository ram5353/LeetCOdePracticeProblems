import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        Words obj = new Words();
        System.out.println(obj.wordSubsets(new String[]{"amazon","apple","facebook","google","leetcode"}, new String[]{"e", "o"}));
    }
}

class Words {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] maxCharSeq = new int[26];
        for (String value : words2) {
            int[] charCount = getMaxCharacterSequence(value);
            for (int j = 0; j < 26; j++) {
                maxCharSeq[j] = Math.max(maxCharSeq[j], charCount[j]);
            }
        }

        for (String s : words1) {
            int[] charCountA = getMaxCharacterSequence(s);
            boolean valid = true;
            for (int j = 0; j < 26; j++) {
                if (maxCharSeq[j] > charCountA[j]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(s);
            }
        }
        return result;
    }

    public int[] getMaxCharacterSequence(String s) {
        int[] result = new int[26];
        for (char c : s.toCharArray()) {
            result[c - 'a']++;
        }
        return result;
    }
}
