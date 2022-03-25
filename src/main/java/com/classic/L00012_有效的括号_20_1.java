package com.classic;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class L00012_有效的括号_20_1 {

    public boolean isValid(String s) {
        if(s == null || s.equals("")){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curChar = s.charAt(i);

            if(curChar == '(' || curChar == '{' || curChar == '['){
                stack.push(curChar);
            }else if(curChar == ')'){
                if(!stack.empty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(curChar == '}'){
                if(!stack.empty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(curChar == ']'){
                if(!stack.empty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
