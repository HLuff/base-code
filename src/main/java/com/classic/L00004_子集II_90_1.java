package com.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L00004_子集II_90_1 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        Arrays.sort(nums);
        backtrack(0, nums, new ArrayList<>(), resList);
        return resList;
    }

    public void backtrack(int index, int[] nums, List<Integer> subList, List<List<Integer>> resList){
        resList.add(new ArrayList<>(subList));

        for(int i = index; i < nums.length; i++){

            if(i > index && nums[i] == nums[i - 1]){
                continue;
            }
            subList.add(nums[i]);
            backtrack(i + 1, nums, subList, resList);
            subList.remove(subList.size() - 1);
        }
    }
}
