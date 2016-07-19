package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction
 * (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Example 1:
 * Input: [7, 1, 5, 3, 6, 4]
 * Output: 5
 * <p>
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * Example 2:
 * Input: [7, 6, 4, 3, 1]
 * Output: 0
 * <p>
 * In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = new int[]{7, 2, 5, 3, 6, 4, 1, 8};
        System.out.println(maxProfit(prices) + "");
    }

    private static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2)
            return 0;
        int result = 0, buyIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= prices[buyIndex])
                buyIndex = i;
            else if (prices[i] - prices[buyIndex] > result)
                result = prices[i] - prices[buyIndex];
        }
        return result;
    }
}
