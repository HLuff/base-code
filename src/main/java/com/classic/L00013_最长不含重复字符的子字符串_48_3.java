package com.classic;

import java.util.HashMap;
import java.util.Map;

public class L00013_最长不含重复字符的子字符串_48_3 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int[] index = new int[128];

        for(int i = 0, j = 0; j < n; j++){
            i = Math.max(index[s.charAt(j)], i);
            index[s.charAt(j)] = j + 1;
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
