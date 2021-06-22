/*
Runtime: 1 ms
Memory Usage: 38.9 MB
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices.length == 1){
            return maxProfit;
        }
        int i = 0, buy = prices[0];
        while(i<prices.length - 1){
            if(prices[i+1]<=prices[i]){
                while(i<prices.length-1 && prices[i+1]<=prices[i])
                    i++;
            }
            buy = prices[i];
            if(i<prices.length-1 && prices[i+1]>prices[i]){
                while(i<prices.length-1 && prices[i+1]>prices[i])
                    i++;
                maxProfit += prices[i] - buy;
            }
            i++;
        }
        return maxProfit;
    }
}
