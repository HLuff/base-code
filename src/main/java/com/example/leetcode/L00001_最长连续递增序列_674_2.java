package com.example.leetcode;

/**
 * @author 35464
 * @date 2020/7/25
 */
public class L00001_最长连续递增序列_674_2 {


    // 一维数组dp[]动态规划 从后往前推
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[len - 1] = 1;
        int maxLen = 1;

        for(int i = len - 2; i >= 0; i--){

            if(nums[i] < nums[i + 1]){

                dp[i] = dp[i + 1] + 1;
                maxLen = Math.max(maxLen, dp[i]);
            }else{
                dp[i] = 1;
            }
        }
        return maxLen;
    }

    // 一维数组dp[]动态规划 从前往后推
    public int findLengthOfLCIS_1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = 1;
        int maxLen = 1;

        for(int i = 1; i < len; i++){

            if(nums[i] > nums[i - 1]){

                dp[i] = dp[i - 1] + 1;
                maxLen = Math.max(maxLen, dp[i]);
            }else{
                dp[i] = 1;
            }
        }
        return maxLen;
    }


}
