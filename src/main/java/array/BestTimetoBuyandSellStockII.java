package array;

public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 2, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0, 9}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
