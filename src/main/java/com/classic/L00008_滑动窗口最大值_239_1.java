package com.classic;

import java.util.LinkedList;

public class L00008_滑动窗口最大值_239_1 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || k < 1 || nums.length < k){
            return null;
        }

        LinkedList<Integer> qMax = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;

        for(int i = 0; i < nums.length; i++){

            while(!qMax.isEmpty() && nums[i] >= nums[qMax.peekLast()]){
                qMax.pollLast();
            }
            qMax.addLast(i);

            if(qMax.peekFirst() == i - k){
                qMax.pollFirst();
            }

            if(i >= k - 1){
                res[index++] = nums[qMax.peekFirst()];
            }
        }
        return res;
    }
}
