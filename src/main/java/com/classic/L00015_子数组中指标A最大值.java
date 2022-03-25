package com.classic;

import java.util.Stack;

public class L00015_子数组中指标A最大值 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 2, 3, 5};
        max2(arr);
    }

    public static int max2(int[] arr) {
        int size = arr.length;
        int[] sums = new int[size];
        sums[0] = arr[0];
        for (int i = 1; i < size; i++) {
            sums[i] = sums[i - 1] + arr[i];
        }
        int max = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < size; i++) {
            System.out.println(i + "--------------------------");
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int j = stack.pop();
                System.out.println("   出栈：" + j + " " + arr[j] + " " + (stack.isEmpty() ? sums[i - 1] : (sums[i - 1] - sums[stack.peek()])) * arr[j]);
                max = Math.max(max, (stack.isEmpty() ? sums[i - 1] : (sums[i - 1] - sums[stack.peek()])) * arr[j]);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int j = stack.pop();
            System.out.println("--------------------------");
            System.out.println("   出栈：" + j + " " + arr[j] + " " + (stack.isEmpty() ? sums[size - 1] : (sums[size - 1] - sums[stack.peek()])) * arr[j]);
            max = Math.max(max, (stack.isEmpty() ? sums[size - 1] : (sums[size - 1] - sums[stack.peek()])) * arr[j]);
        }
        return max;
    }
}
