class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0 ; i<n ; i++){
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
}