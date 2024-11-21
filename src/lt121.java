public class lt121 {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int ans = 0;
        int len = prices.length;
        for (int cell = 0; cell< len; cell++){
            if (prices[cell]- prices[buy]>=0){
                ans = Math.max(ans,prices[cell]- prices[buy]);
            } else {
                buy = cell;
            }
        }
        return ans;
    }
}
