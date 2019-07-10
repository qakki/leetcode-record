package dp;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/5 0005
 * @description： longest-common-subsequence problem
 * 最长公共子序列
 */
public class LCS {
    public static void main(String[] args) {
        System.out.println(lcs("str", "skt"));
    }

    public static int lcs(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
