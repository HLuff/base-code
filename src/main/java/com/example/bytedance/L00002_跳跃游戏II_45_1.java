package com.example.bytedance;

import java.io.File;
import java.util.*;

public class L00002_跳跃游戏II_45_1 {

	public static void main(String[] args) throws Exception {
		File file = new File("src/笔试编程/data1.txt");
		Scanner sc = new Scanner(file);
		// Scanner sc = new Scanner(System.in);
	}

	public int jump(int[] nums) {
        
		
        return func(nums, 0);
    }
	
	public int func(int[] arr, int index) {
        
        if(index >= arr.length - 1){
            return 0;
        }

		if(arr[index] >= arr.length) {
			return 1;
		}
		
		if(arr[index] == 0) {
			return Integer.MAX_VALUE/2;
		}
		
		int res = Integer.MAX_VALUE;
		for(int i = 1; i <= arr[index]; i++) {
			
			res = Math.min(res, 1 + func(arr, index + i));
		}
		
		return res;
		
	}
}
