package com.Arrays;

public class BestTimeToSellStockII {
    static void main(String[] args) {
        int[] arr = {4,5,9,2,7};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfitII(arr));
    }
    static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }

    static int maxProfitII(int[] prices) {
        int minPrice  = Integer.MAX_VALUE;
        int totalProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            if(prices[i] > minPrice) {
                int profit = prices[i] - minPrice;
                totalProfit += profit;
                minPrice = prices[i];
            }
        }
        return totalProfit;
    }
}
