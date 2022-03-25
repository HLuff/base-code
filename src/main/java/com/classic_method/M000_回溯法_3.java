package com.classic_method;

import java.util.*;
import java.util.stream.Collectors;

public class M000_回溯法_3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = permute(arr);
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> resList = new LinkedList<>();
        if(nums == null || nums.length == 0){
            return resList;
        }
        backtrack(0, Arrays.stream(nums).boxed().collect(Collectors.toList()), resList);
        return resList;
    }

    public static void backtrack(int index, List<Integer> numList, List<List<Integer>> resList){
        System.out.println(index + " "+numList.toString());
        if(index == numList.size()){
            resList.add(new ArrayList<>(numList));
            return;
        }

        for(int i = index; i< numList.size(); i++){
            Collections.swap(numList, index, i);
            backtrack(index + 1, numList, resList);
            Collections.swap(numList, index, i);
        }
    }
}
