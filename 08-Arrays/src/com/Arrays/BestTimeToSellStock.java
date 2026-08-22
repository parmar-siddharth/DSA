package com.Arrays;

public class BestTimeToSellStock {
    static void main(String[] args) {
        int[] arr = {4,5,9,2,7};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i : prices){
            minPrice = Math.min(minPrice,i);
            int profit = i - minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
