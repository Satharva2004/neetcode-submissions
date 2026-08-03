class Solution {
    public int maxProfit(int[] prices) {
        int prev = prices[0];
        int max_len = 0;
        for(int i =1; i < prices.length; i++){
            int profit = prices[i]- prev;
            max_len = Math.max(max_len, profit);
            if(prev > prices[i]){
                prev = prices[i];
            }
        }
        return max_len;
    }
}
