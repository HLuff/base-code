package com.classic_method;

import java.util.ArrayList;
import java.util.List;

public class M000_回溯法_2 {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        List<List<Integer>> resList = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), resList);
        System.out.println(resList);
    }

    public static void backtrack(int index, int[] nums, List<Integer> subList, List<List<Integer>> resList){

        resList.add(new ArrayList<>(subList));
        for(int i = index; i < nums.length; i++){

            subList.add(nums[i]);
            backtrack(i + 1, nums, subList, resList);
            subList.remove(subList.size() - 1);
        }
    }
}
