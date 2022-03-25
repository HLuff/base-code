package com.classic;

import java.util.*;
import java.util.stream.Collectors;

public class L00001_全排列II_47_2 {

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

        process(new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()), resList);
        return resList;
    }

    public static void process(List<Integer> curList, List<Integer> numList, List<List<Integer>> resList){
        if(numList.isEmpty()){
            resList.add(curList);
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(Integer num : numList){
            if(!set.contains(num)){
                set.add(num);
                // 当前列表加个num
                List<Integer> nextList = new ArrayList<>(curList);
                nextList.add(num);
                // 剩余列表减个num
                List<Integer> nextNumList = new ArrayList<>(numList);
                nextNumList.remove(num);

                process(nextList, nextNumList, resList);
            }
        }
    }
}
