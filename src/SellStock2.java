public class SellStock2 {

    public static void main(String[] args) {
        Solution5 obj = new Solution5();
        System.out.println(obj.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}

class Solution5 {
    public int maxProfit(int[] prices) {
        int diff = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                diff += prices[i]-prices[i-1];
            }
        }
        return diff;
    }

}

