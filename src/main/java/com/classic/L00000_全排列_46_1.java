package com.classic;

import java.util.Arrays;

public class L00000_全排列_46_1 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        func(0, arr);
    }

    public static void func(int index, int[] arr){
        if(index == arr.length - 1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = index; i < arr.length; i++){
            {int tmp = arr[index]; arr[index] = arr[i]; arr[i] = tmp;}

            func(index + 1, arr);

            {int tmp = arr[index]; arr[index] = arr[i]; arr[i] = tmp;}
        }
    }
}
