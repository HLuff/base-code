package com.classic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L00006_组合总和_39_2 {


    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return resList;
        }
        // 优化1
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>(), resList);
        return resList;
    }

    public void backtrack(int index, int residue, int[] candidates,
                          List<Integer> subList, List<List<Integer>> resList){
        if(residue == 0){
            resList.add(new ArrayList<>(subList));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            // 当前值大于剩余值
            if(candidates[i] > residue){
                // 优化1：排序后可以提前结束
                break;
            }
            subList.add(candidates[i]);
            // 因为重复使用，传递的还是i而不是i + 1
            backtrack(i, residue - candidates[i], candidates, subList, resList);
            subList.remove(subList.size() - 1);
        }
    }
}
