package com.classic;

import java.util.*;

public class L00001_全排列II_47_1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = permuteUnique(arr);
        System.out.println(res);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayDeque<>(), resList);
        return resList;
    }

    public static void backtrack(int[] nums, boolean[] used, Deque<Integer> stack, List<List<Integer>> resList){
        if(stack.size() == nums.length){
            resList.add(new ArrayList<>(stack));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            if(i > 0 && nums[i - 1] == nums[i] && !used[i - 1]){
                continue;
            }

            used[i] = true;
            stack.addLast(nums[i]);
            backtrack(nums, used, stack, resList);
            stack.removeLast();
            used[i] = false;
        }
    }
}
