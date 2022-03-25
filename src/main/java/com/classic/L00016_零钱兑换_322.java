package com.classic;

import java.util.HashMap;
import java.util.Stack;

public class L00016_零钱兑换_322 {

    public int coinChange(int[] coins, int amount) {
        if(coins == null || coins.length == 0 || amount <= 0){
            return 0;
        }

        HashMap<String, Integer> map = new HashMap<>();
        int res = func(coins, 0, amount, 0, map);
        if(res == Integer.MAX_VALUE){
            return -1;
        }else{
            return res;
        }
    }

    public static int func(int[] arr, int i, int aim, int sum, HashMap<String, Integer> map){
        String key = i + "_" + aim + "_" + sum;

        if(map.containsKey(key)){
            return map.get(key);
        }

        if(i == arr.length){
            int ans = aim == 0 ? sum : Integer.MAX_VALUE;
            map.put(key, ans);
            return ans;
        }

        int ans = Integer.MAX_VALUE;
        for(int z = 0; arr[i] * z <= aim; z++){

            int fix = z * arr[i];
            int rest = aim - fix;
            ans = Math.min(ans, func(arr, i + 1, rest, sum + z, map));
        }

        map.put(key, ans);
        return ans;
    }
}
