package com.classic;

import java.util.Stack;

public class L00012_有效的括号_20_2 {

    public boolean isValid(String s) {
        if(s == null || s.equals("")){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            switch (curChar) {
                case '(':
                case '{':
                case '[':
                    stack.push(curChar);
                    break;
                case ')':
                    if (!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }

        return stack.empty();
    }
}
