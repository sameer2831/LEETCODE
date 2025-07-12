class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int profit = 0;
        for (int i :prices) {
            minbuy=Math.min(minbuy,i);
            profit=Math.max(profit,i-minbuy);            
        }
        return profit;
    }
}