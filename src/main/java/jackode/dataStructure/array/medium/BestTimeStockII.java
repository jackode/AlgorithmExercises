package jackode.dataStructure.array.medium;

/**
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.<br>
 * <p>
 * Design an algorithm to find the maximum profit. You may complete
 * <strong>as many transactions as you like</strong> (ie, buy one and sell
 * one share of the stock multiple times). However, you may not engage in
 * multiple transactions at the same time (ie, you must sell the stock
 * before you buy again).
 * <p>
 * Tags: Array, Greedy
 */
public class BestTimeStockII {
    /**
     * Sell whenever there is profit.
     * If next value is bigger, add the difference up to the profit
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++)
            if (prices[i + 1] > prices[i]) {
                max += prices[i + 1] - prices[i];
            }
        return max;
    }
}
