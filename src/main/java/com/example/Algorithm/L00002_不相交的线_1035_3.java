package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/8/2
 */
public class L00002_不相交的线_1035_3 {

    public static void main(String[] args) {

    }


    /**
     * 不是最优的思路
     * （1）当前值相等情况下结果一定会大于等于拿后一值判断的结果
     * （2）遍历没有必要，直接作为递归往后传就行了
     */
    public int maxUncrossedLines(int[] A, int[] B) {

        if (A == null || B == null
                || A.length == 0 || B.length == 0) {

            return 0;
        }

        int x = A.length;
        int y = B.length;
        int[][] dp = new int[x + 1][y + 1];

        for (int i = x - 2; i >= 0; i--) {
            for (int j = y - 2; j >= 0; j--) {

                int res = 0;

                if (A[i] == B[j]) {
                    res = Math.max(res, 1 + dp[i + 1][j + 1]);
                }

                res = Math.max(res, dp[i][j + 1]);


                res = Math.max(res, dp[i + 1][j]);
                dp[i][j] = res;
            }
        }

        return dp[0][0];
    }

}
