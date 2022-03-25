package com.classic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L00013_最长不含重复字符的子字符串_48_2 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0, j = 0; j < n; j++){
            // 发现重复i右移(此时的字符串最短 abcabcnn)
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            // j每次都存,当前为重复位，需要再进一位
            map.put(s.charAt(j), j + 1);

            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
