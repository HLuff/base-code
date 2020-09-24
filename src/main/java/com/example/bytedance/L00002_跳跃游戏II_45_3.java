package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00002_跳跃游戏II_45_3 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);

	}

	public int jump(int[] nums) {
		if(nums == null || nums.length <= 1) {
			return 0;
		}
		int len = nums.length;
		int[] dp = new int[len];
		dp[len - 1] = 0;
		for(int i = len - 2; i >= 0; i--) {
			if(nums[i] <= 0) {
				dp[i] = Integer.MAX_VALUE / 2;
			}else {
				int min = Integer.MAX_VALUE;
				for(int j = 1; j <= nums[i]; j++) {
					if(i + j > len - 1) {
						break;
					}
					min = Math.min(min, 1 + dp[i + j]);
				}
				dp[i] = min;
			}
		}
		
		return dp[0];
	}

}
