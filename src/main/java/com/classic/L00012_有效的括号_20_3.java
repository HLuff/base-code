package com.classic;

import java.util.Stack;

public class L00012_有效的括号_20_3 {

    public boolean isValid(String s) {
        if(s == null || s.equals("")){
            return false;
        }

        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            if(s.contains("()")){
                s = s.replace("()", "");
            }else if(s.contains("{}")){
                s = s.replace("{}", "");
            }else if(s.contains("[]")){
                s = s.replace("[]", "");
            }
        }
        return s.isEmpty();
    }
}
