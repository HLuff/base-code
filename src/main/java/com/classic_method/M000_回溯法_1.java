package com.classic_method;

import java.util.ArrayList;
import java.util.List;

public class M000_回溯法_1 {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), resList);
        System.out.println(resList);

    }

    public static void backtrack(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> resList){

        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }

            used[i] = true;
            list.add(nums[i]);
            resList.add(new ArrayList<>(list));
            backtrack(nums, used, list, resList);
            list.remove(list.size() - 1);
            used[i] = false;
        }
    }
}
