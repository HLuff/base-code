package com.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class L00000_全排列_46_4 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = permute(arr);
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> resList = new LinkedList<>();
        if(null == nums || nums.length == 0){
            return null;
        }
        func(new ArrayList<>(), Arrays.stream(nums).boxed().collect(Collectors.toList()), resList);
        return resList;
    }

    public static void func( List<Integer> curList, List<Integer> numList, List<List<Integer>> resList){
        if(numList.isEmpty()){
            resList.add(curList);
            return;
        }
        for(Integer num : numList){
            // 新curList获取到新的数据元素
            List<Integer> nextList = new ArrayList<>(curList);
            nextList.add(num);

            // 新numList删去已经被获取的数据
            List<Integer> nextNumList = new ArrayList<>(numList);
            nextNumList.remove(num);

            func(nextList, nextNumList, resList);
        }
    }
}
