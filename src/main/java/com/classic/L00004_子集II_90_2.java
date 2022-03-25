package com.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L00004_子集II_90_2 {


    public static void main(String[] args) {

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        Arrays.sort(nums);
        dfs(0, nums, new ArrayList<>(), resList);
        return resList;
    }

    public static void dfs(int index, int[] nums, List<Integer> subList, List<List<Integer>> resList){

        if(index == nums.length){
            resList.add(subList);
            return;
        }
        // 算出重复的结束位置，起码index + 1
        int lastIndex = index;
        while(lastIndex < nums.length && nums[lastIndex] == nums[index]){
            lastIndex++;
        }

        // 不加
        dfs(lastIndex, nums, new ArrayList<>(subList), resList);

        for(int i = index; i < lastIndex; i++){
            // 依次加了往后传
            subList.add(nums[i]);
            dfs(lastIndex, nums, new ArrayList<>(subList), resList);
        }
    }
}
