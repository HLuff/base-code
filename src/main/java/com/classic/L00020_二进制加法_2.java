package com.classic;

public class L00020_二进制加法_2 {

    public static void main(String[] args) {
        addBinary("11", "10");
    }

    public static String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();

        int n = Math.max(a.length(), b.length());
        int carry = 0;
        for(int i = 0; i < n; i++){
            carry += i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            System.out.println("carry:" + carry);
            carry += i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;
            System.out.println("carry:" + carry);
            int res = (char)(carry % 2 + '0');
            System.out.println("res:" + res);
            sb.append( (char)(carry % 2 + '0'));
            carry /= 2;
        }
        if(carry > 0){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
