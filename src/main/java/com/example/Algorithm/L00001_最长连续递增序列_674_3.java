package com.example.Algorithm;

/**
 * @author 35464
 * @date 2020/7/25
 */
public class L00001_最长连续递增序列_674_3 {


    // 单变量动态规划 从后往前推
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int dp = 1;
        int maxLen = 1;

        for(int i = len - 2; i >= 0; i--){

            if(nums[i] < nums[i + 1]){

                dp += 1;
                maxLen = Math.max(maxLen, dp);
            }else{
                dp = 1;
            }
        }
        return maxLen;
    }

    // 单变量动态规划 从前往后推
    public int findLengthOfLCIS_1(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int dp = 1;
        int maxLen = 1;

        for(int i = 1; i < len; i++){

            if(nums[i] > nums[i - 1]){

                dp += 1;
                maxLen = Math.max(maxLen, dp);
            }else{
                dp = 1;
            }
        }
        return maxLen;
    }


}
