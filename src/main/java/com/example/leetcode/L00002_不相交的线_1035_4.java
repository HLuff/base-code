package com.example.leetcode;

/**
 * @author 35464
 * @date 2020/8/2
 */
public class L00002_不相交的线_1035_4 {

    public static void main(String[] args) {
        
    }

    public int maxUncrossedLines(int[] A, int[] B) {

        return func(A, 0, B, 0);
    }

    private int func(int[] A, int x, int[] B, int y) {

        if(x > A.length - 1 || y > B.length - 1){
            return 0;
        }


        if(A[x] == B[y]){
            return 1 + func(A, x + 1, B, y + 1);
        }else{
            return Math.max(func(A, x + 1, B, y),
                            func(A, x, B, y + 1));
        }
    }


}
