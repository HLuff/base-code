package com.classic;

import java.util.ArrayList;
import java.util.List;

public class L00003_子集_78_2 {


    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        dfs(0, nums, new ArrayList<>(), resList);
        return resList;
    }

    public static void dfs(int index, int[] nums, List<Integer> subList, List<List<Integer>> resList){

        if(index == nums.length){
            resList.add(subList);
            return;
        }
        // 不加，需要重新拷贝
        dfs(index + 1, nums, new ArrayList<>(subList), resList);

        // 加，需要重新拷贝
        subList.add(nums[index]);
        dfs(index + 1, nums, new ArrayList<>(subList), resList);
    }
}
