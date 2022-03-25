package com.classic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L00000_全排列_46_3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = permute(arr);
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> resList = new LinkedList<>();
        if(null == nums || nums.length == 0){
            return null;
        }
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), resList);
        return resList;
    }

    public static void backtrack(int[] nums, boolean[] used,
                                 List<Integer> list, List<List<Integer>> resList){
        if(list.size() == nums.length){
            resList.add(new ArrayList<>(list));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            used[i] = true;
            list.add(nums[i]);
            backtrack(nums, used, list, resList);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
