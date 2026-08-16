class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int max = 0;
        while(j < prices.length){
            int profit = prices[j] - prices[i];
            if(profit >= max){
                max = Math.max(profit, max);
            }
            if(prices[j] <= prices[i]){
                i = j;
            }
            j++;
        }
        return max;
    }
}
