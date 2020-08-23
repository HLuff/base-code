package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/8/2
 */
public class L00002_不相交的线_1035_5 {

    public static void main(String[] args) {
        
    }

    public int maxUncrossedLines(int[] A, int[] B) {


        int i = A.length;
        int j = B.length;
        int[][] cache = new int[i][j];

        return func(A, 0, B, 0, cache);
    }

    private int func(int[] A, int x, int[] B, int y, int[][] cache) {

        if(x > A.length - 1 || y > B.length - 1){
            return 0;
        }

        if(cache[x][y] != 0){
            return cache[x][y];
        }

        int res = 0;


        if(A[x] == B[y]){
            res=  1 + func(A, x + 1, B, y + 1, cache);
        }else{
            res =  Math.max(func(A, x + 1, B, y, cache),
                            func(A, x, B, y + 1, cache));
        }

        cache[x][y] = res;

        return res;
    }


}
