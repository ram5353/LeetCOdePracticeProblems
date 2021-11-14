package Oct19;


import java.util.Arrays;

public class BuyAndSellStock {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int price : prices) {
            if (price < minValue) {
                minValue = price;
            } else if (price - minValue > maxValue) {
                maxValue = price - minValue;
            }
        }
        return maxValue;
    }
}
