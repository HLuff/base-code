package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00001_跳跃游戏_55_1 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	public boolean canJump(int[] nums) {

		return func(nums, 0);
	}
	
	public boolean func(int[] arr, int index) {
		// 可以走到尾
		if(index >= arr.length - 1) {
			return true;
		}
		
		// 走到0停止
		if(arr[index] == 0) {
			return false;
		}
		
		boolean res = false;
		for(int i = 1; i <= arr[index]; i++) {
			
			res |= func(arr, index + i);
		}
		
		return res;
	}
}
