class Solution {
    public int maxProfit(int[] prices) {
        int today = prices[0];
        int profit = 0;
        int best = 0; 
        for(int i=1;i<prices.length;i++){
            profit = prices[i] - today;

            if(profit > best){
                best = profit;
            }
            if(prices[i] < today){
                today = prices[i];
            }

           
        }
         return best;
}
}
