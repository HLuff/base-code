package com.classic;

import java.util.ArrayList;
import java.util.List;

public class L00011_和为s的连续正数序列_57 {

    public int[][] findContinuousSequence(int target) {

        List<int[]> res = new ArrayList<>();
        int low = 1, high = 2;

        while(high > low){
            int cur = (low + high) * (high - low + 1) / 2;
            if(cur == target){
                int[] arr = new int[high - low + 1];
                for(int i = low; i <= high; i++ ){
                    arr[i - low] = i;
                }
                res.add(arr);
                low++;
            }else if(cur < target){
                high++;
            }else{
                low++;
            }
        }
        return res.toArray(new int[2][]);
    }
}
