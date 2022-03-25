package com.classic;

import java.util.*;

public class L00013_最长不含重复字符的子字符串_48_1 {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, max = 0;

        while(right < s.length()){
            // 循环删除
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            // 必添加
            set.add(s.charAt(right));
            right++;
            max = Math.max(right - left, max);
        }
        return max;
    }
}
