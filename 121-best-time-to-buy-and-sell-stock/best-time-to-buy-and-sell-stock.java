class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update the lowest price seen so far
            if (price < minPrice) {
                minPrice = price;
            } else {
                // Check if selling today gives a better profit
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
        
    }
}