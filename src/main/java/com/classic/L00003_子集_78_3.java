package com.classic;

import java.util.ArrayList;
import java.util.List;

public class L00003_子集_78_3 {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> resList = subsets_enumerate(nums);
        System.out.println(resList);
    }
    // 循环枚举
    public static List<List<Integer>> subsets_enumerate(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        // 先添加空列表
        resList.add(new ArrayList<>());
        for (int num : nums) {

            // 必须将size提出来，因为resList在不停的变化
            int size = resList.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newSubList = new ArrayList<>(resList.get(j));
                newSubList.add(num);

                resList.add(newSubList);
            }
        }
        return resList;
    }

    // 递归枚举
    public static List<List<Integer>> subsets_recursion(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        // 先添加空列表
        resList.add(new ArrayList<>());
        // 递归代替循环
        recursion(0, nums, resList);
        return resList;
    }


    public static void recursion(int index, int[] nums, List<List<Integer>> resList) {
        if(index >= nums.length){
            return;
        }
        // 必须将size提出来，因为resList在不停的变化
        int size = resList.size();
        for (int j = 0; j < size; j++) {
            List<Integer> newSubList = new ArrayList<>(resList.get(j));
            newSubList.add(nums[index]);

            resList.add(newSubList);
        }

        recursion(index + 1, nums, resList);
    }



}
