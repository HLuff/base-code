package com.classic;

import java.util.ArrayList;
import java.util.List;

public class L00003_子集_78_1 {


    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        backtrack(0, nums, new ArrayList<>(), resList);
        return resList;
    }

    public static void backtrack(int index, int[] nums,
                                 List<Integer> subList, List<List<Integer>> resList){
        resList.add(new ArrayList<>(subList));
        for(int i = index; i < nums.length; i++){
            subList.add(nums[i]);
            // 必须从当前i加，否则从index加会存在重复计算
            backtrack(i + 1, nums, subList, resList);
            subList.remove(subList.size() - 1);
        }
    }
}
