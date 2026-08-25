class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sellPrice = Integer.MAX_VALUE;

        for(int currentPrice: prices){
            if(currentPrice<sellPrice)
            sellPrice = currentPrice;
            if(currentPrice-sellPrice>maxProfit)
            maxProfit = currentPrice - sellPrice;
        }
        return maxProfit;
        }
    }