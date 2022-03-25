package com.example.PAT;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 35464
 * @date 2020/7/25
 */
public class L002_数字分类 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        int len = Integer.valueOf(arr[0]);
        int A1 = 0;
        int A2 = 0;
        boolean A2Flag = true;
        int A3 = 0;
        float A4 = 0;
        int A4Count = 0;
        int A5 = 0;

        for(int i = 1; i < arr.length; i++){
            int num = Integer.valueOf(arr[i]);

            if( num % 5 == 0 && num % 2 == 0 ){
                A1 += num;
            }

            if(num % 5 == 1){
                A2 = A2 + (A2Flag ? num : -num);
                A2Flag = !A2Flag;
            }

            if(num % 5 == 2){
                A3++;
            }

            if(num % 5 == 3){
                A4 += num;
                A4Count++;
            }

            if(num % 5 == 4){
                A5 = Math.max(A5, num);
            }
        }


        if(A1 == 0){
            System.out.print("N ");
        }else{
            System.out.print(A1 + " ");
        }

        if(A2 == 0){
            System.out.print("N ");
        }else{
            System.out.print(A2 + " ");
        }

        if(A3 == 0){
            System.out.print("N ");
        }else{
            System.out.print(A3 + " ");
        }

        if(A4 == 0){
            System.out.print("N ");
        }else{

            System.out.print(new DecimalFormat("0.0").format(A4 / A4Count) + " ");
        }

        if(A5 == 0){
            System.out.print("N");
        }else{
            System.out.print(A5);
        }
    }
}
