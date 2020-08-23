package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/8/2
 */
public class L00002_不相交的线_1035_2 {

    public static void main(String[] args) {
        
    }

    public int maxUncrossedLines(int[] A, int[] B) {

        if(A == null || B == null
                || A.length == 0 || B.length == 0){

            return 0;
        }

        int i = A.length;
        int j = B.length;
        int[][] cache = new int[i][j];

        return func(A, 0, B, 0, cache);
    }

    /**
     * 不是最优的思路
     * （1）当前值相等情况下结果一定会大于等于拿后一值判断的结果
     * （2）遍历没有必要，直接作为递归往后传就行了
     */
    private int func(int[] A, int x, int[] B, int y, int[][] cache) {

        if(x > A.length - 1 || y > B.length - 1){
            return 0;
        }

        if(cache[x][y] != 0){
            return cache[x][y];
        }

        int res = 0;
        int len = 0;

        // 一种选择是 当前A的节点与B当前位置后面全部比较查找（可能没找到）
        for(int i = y; i < B.length; i++){

            if(A[x] == B[i]){
                len = 1 + func(A, x + 1, B, i + 1, cache);
            }
            res = Math.max(res, len);
        }

        // 另一种选择 不管当前A的x位置是否匹配，直接忽略比较x+1与y
        len = func(A, x + 1, B, y, cache);

        cache[x][y] = Math.max(res, len);

        return cache[x][y];
    }
}
