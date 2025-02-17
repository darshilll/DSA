class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int profit : prices ){
            minPrice = Math.min(minPrice, profit);
            maxProfit = Math.max(maxProfit,profit-minPrice);
        }
        return maxProfit;
    }
}