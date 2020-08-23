package com.example.PAT.乙级;

import java.util.Scanner;

/**
 * @author 35464
 * @date 2020/7/26
 */
public class L003_数素数 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int index = 2;
        int sum = 0;
        int next= 0;

        while(true){
            if(isPrime(index)){
                sum++;
                if(sum >= start && sum <= end){
                    next++;
                    if(next == end - start + 1){
                        System.out.print(index);
                    }else if(next % 10 == 0){
                        System.out.println(index);
                    }else{
                        System.out.print(index + " ");
                    }
                }

                if(sum > end){
                    break;
                }
            }
            index++;
        }

    }

    // 素数 1不是2是
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        // Math.sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++){

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
