package com.classic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L00007_组合总和II_40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resList = new ArrayList<>();
        if(candidates == null || candidates.length == 0){
            return resList;
        }
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>(), resList);
        return resList;

    }

    public void backtrack(int index, int residue, int[] candidates, List<Integer> subList, List<List<Integer>> resList){
        if(residue == 0){
            resList.add(new ArrayList<>(subList));
            return;
        }

        for(int i = index; i < candidates.length; i++){
            if(candidates[i] > residue){
                break;
            }
            // 保证同层不会出现重复的获取
            if(i > index && candidates[i] == candidates[i - 1]){
                continue;
            }
            subList.add(candidates[i]);
            backtrack(i + 1, residue - candidates[i], candidates, subList, resList);
            subList.remove(subList.size() - 1);
        }
    }
}
