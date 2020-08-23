package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/8/2
 */
public class L00002_不相交的线_1035_6 {

    public int maxUncrossedLines(int[] A, int[] B) {

        if (A == null || B == null
                || A.length == 0 || B.length == 0) {

            return 0;
        }

        int x = A.length;
        int y = B.length;
        int[][] dp = new int[x + 1][y + 1];

        for (int i = x - 1; i >= 0; i--) {
            for (int j = y - 1; j >= 0; j--) {

                int len = 0;

                if (A[i] == B[j]) {
                    len = 1 + dp[i + 1][j + 1];
                }else{
                    len = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
                dp[i][j] = len;
            }
        }

        return dp[0][0];
    }

}
