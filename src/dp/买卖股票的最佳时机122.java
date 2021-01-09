package dp;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/11 0011
 * @description：
 */
public class 买卖股票的最佳时机122 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
