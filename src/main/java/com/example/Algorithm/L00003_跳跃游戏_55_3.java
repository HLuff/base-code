package com.example.Algorithm;

import java.io.File;
import java.util.*;

public class L00003_跳跃游戏_55_3 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

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
			
			for (int j = 1; j <= nums[i]; j++) {

				if (i + j >= nums.length - 1 || dp[i + j] == true) {
					dp[i] = true;
					break;
				}
			}

		}
		return dp[0];
	}

}
