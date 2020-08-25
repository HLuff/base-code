package com.example.Algorithm;

import java.io.File;
import java.util.*;

public class L00003_跳跃游戏_55_4 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	// 逆向推
	public boolean canJump(int[] nums) {
		
		if (nums == null || nums.length == 0) {
			return false;
		}
		// pos表示需要到达的位置
		int pos = nums.length - 1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] + i >= pos) {
				pos = i;
			}
		}
		return pos == 0;
	}

}
