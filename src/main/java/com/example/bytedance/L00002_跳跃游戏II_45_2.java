package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00002_跳跃游戏II_45_2 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	public int jump(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		return func(nums, 0, map);
	}

	public int func(int[] arr, int index, Map<Integer, Integer> map) {

		if (index >= arr.length - 1) {
			return 0;
		}

		if (arr[index] >= arr.length) {
			return 1;
		}

		if (arr[index] == 0) {
			return Integer.MAX_VALUE / 2;
		}

		if (map.containsKey(index)) {
			return map.get(index);
		}

		int res = Integer.MAX_VALUE;
		for (int i = 1; i <= arr[index]; i++) {

			res = Math.min(res, 1 + func(arr, index + i, map));
		}

		map.put(index, res);

		return res;

	}
}
