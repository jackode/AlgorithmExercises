package jackode.dataStructure.array.easy;

/**
 * Say you have an array for which the ith element is the price of a given
 * stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * <p>
 * Tags: Array, DP
 */
public class BestTimeStock {
    /**
     * Optimized bottom-up approach
     * O(n) Time, O(1) Space
     * Just record yesterday's profit
     * Update min, max and profit
     * If next price is bigger, it's only possible to update the profit
     * If next price is smaller or equal, it's only possible to update min
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0; // need at least 2
        int max = 0;
        int min = prices[0]; // track the minimum of profit array before cur element
        for (int i = 1; i < prices.length; i++) { // note that i starts from 1
            min = Math.min(min, prices[i]); // update min
            if (prices[i] > prices[i - 1]){
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
