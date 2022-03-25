package com.classic;

import java.util.Arrays;

public class L00008_滑动窗口最大值_239_4 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        System.out.println(res);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] prefixMax = new int[n];//后一个分组的前缀
        int[] suffixMax = new int[n];//前一个分组的后缀
        for (int i = 0; i < n; i++) {
            if (i % k == 0) {
                prefixMax[i] = nums[i];
            }
            else {
                prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
            }
        }
        //System.out.println(Arrays.toString(prefixMax));

        for (int i = n - 1; i >= 0; --i) {
            if (i == n - 1 || (i + 1) % k == 0) {
                suffixMax[i] = nums[i];
            } else {
                suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
            }
        }
        //System.out.println(Arrays.toString(suffixMax));

        int[] ans = new int[n - k + 1];
        for (int i = 0; i <= n - k; ++i) {
            ans[i] = Math.max(suffixMax[i], prefixMax[i + k - 1]);
        }
        return ans;
    }

}
