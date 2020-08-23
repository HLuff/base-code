package com.example.PAT.乙级;

import java.util.Scanner;

/**
 * @author 35464
 * @date 2020/7/25
 */
public class L001_A加B和C {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long C = sc.nextLong();
            if( (A + B) > C){
                System.out.println("Case #" + (i + 1) +  ": true");
            }else{
                System.out.println("Case #" + (i + 1) +  ": false");
            }
        }

    }
}
