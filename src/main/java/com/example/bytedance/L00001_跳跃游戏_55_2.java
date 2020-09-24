package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00001_跳跃游戏_55_2 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	// 记忆化搜索
	public boolean canJump(int[] nums) {
		Map<Integer, Boolean> map = new HashMap<>();
		return func(nums, 0, map);
	}
	
	public boolean func(int[] arr, int index, Map<Integer, Boolean> map) {
		if(index >= arr.length - 1) {
			return true;
		}
		
		if(arr[index] == 0) {
			return false;
		}
		
		if(map.containsKey(index)) {
			return map.get(index);
		}
		
		boolean res = false;
		for(int i = 1; i <= arr[index]; i++) {
			// 提前结束
			if(index + i >= arr.length - 1) {
				res |= true;
				break;
			}
			res |= func(arr, index + i, map);
		}
		map.put(index, res);
		
		return res;
	}
	
	
}
