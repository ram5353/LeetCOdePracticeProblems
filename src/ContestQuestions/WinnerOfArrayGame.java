package ContestQuestions;

import java.util.*;

public class WinnerOfArrayGame {
    public static void main(String[] args) {
        ArrayGame obj = new ArrayGame();
        System.out.println(obj.ArrayGameWinner(2));

    }
}

class ArrayGame {
    public int ArrayGameWinner(long k) {
        int[] arr = {2,1,3,5,4,6,7};
        Map<Integer, Integer> matchesWon = new HashMap<>();
        int n = arr.length;
        int currentMax = arr[0];
        for (int i = 1; i < n; i++) {
            currentMax = Math.max(currentMax, arr[i]);
            int count = matchesWon.getOrDefault(currentMax, 0);
            matchesWon.put(currentMax, ++count);
            if (matchesWon.get(currentMax) >= k) {
                return currentMax;
            }
        }
        
        return currentMax;
    }
}
