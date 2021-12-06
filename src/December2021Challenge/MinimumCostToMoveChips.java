package December2021Challenge;

public class MinimumCostToMoveChips {

    public static void main(String[] args) {
        System.out.println(minCostToMoveChips(new int[]{2,2,2,3,3}));
    }

    public static int minCostToMoveChips(int[] position) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < position.length; i++) {
            if (i%2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }
        return Math.min(odd, even);
    }
}
