package com.classic;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class L00008_滑动窗口最大值_239_2 {

    public int[] maxSlidingWindow(int[] nums, int k){

        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[0] != o2[0]
                                                                    ? o2[0] - o1[0]
                                                                    : o2[1] - o1[1]);
        for(int i = 0; i < k; i++){
            pq.offer(new int[]{nums[i], i});
        }

        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];

        for(int i = k; i < n; i++){
            pq.offer(new int[]{nums[i], i});
            while(pq.peek()[1] <= i - k){
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}
