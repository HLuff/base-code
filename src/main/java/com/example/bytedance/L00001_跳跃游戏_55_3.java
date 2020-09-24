package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00001_跳跃游戏_55_3 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	// 从后往前 一维数组动态规划
	public boolean canJump(int[] nums) {

		if (nums == null || nums.length == 0) {
			return false;
		}

		if (nums.length == 1) {
			return true;
		}

		boolean[] dp = new boolean[nums.length];

		for (int i = nums.length - 1; i >= 0; i--) {

			if (nums[i] == 0) {
				continue;
			}
			// 需要在可达范围内判断能否到最后
			for (int j = 1; j <= nums[i]; j++) {

				if (i + j >= nums.length - 1 || dp[i + j] == true) {
					dp[i] = true;
					break;
				}
			}

		}
		return dp[0];
	}

	// 另一种写法
	public boolean canJump2(int[] nums) {
		if(nums == null || nums.length == 0){
			return false;
		}

		boolean[] dp = new boolean[nums.length];
		for(int i = nums.length - 1; i >= 0; i--){
			if(i + nums[i] >= nums.length - 1){
				dp[i] = true;
				continue;
			}

			for(int j = 1; j <= nums[i]; j ++){
				if(dp[j + i] == true){
                    dp[i] = true;
                    continue;
                }
			}
		}

		return dp[0];
	}

}
