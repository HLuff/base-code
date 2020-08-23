package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/7/25
 */
public class L00001_最长连续递增序列_674_1 {

    // 递归 + 记忆化搜索
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int[] cache = new int[len];
        int maxLen = 0;

        for(int i = 0; i < len; i++){
            maxLen = Math.max(maxLen, func(nums, i, cache));
        }
        return maxLen;
    }


    private int func(int[] arr, int i, int[] cache) {

        if (i == arr.length - 1 || arr[i + 1] <= arr[i]) {
            return 1;
        }

        if(cache[i] != 0){
            return cache[i];
        }

        int res = 1 + func(arr, i + 1, cache);
        cache[i] = res;

        return res;
    }




}
