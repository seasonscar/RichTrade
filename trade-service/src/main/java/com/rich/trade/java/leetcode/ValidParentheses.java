package com.rich.trade.java.leetcode;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Solution_ValidParentheses s = new Solution_ValidParentheses();
        String param="[{}]";
        System.out.println(param.length());
        boolean result = s.isValid2(param);
        System.out.println(result);
    }
}

class Solution_ValidParentheses {
    public boolean isValid(String s) {
        int originlength = s.length() / 2;
        for (int i = 0; i < originlength; i++) {
            if (s == "") {
                break;
            }
            s = s.replace("{}", "");
            s = s.replace("[]", "");
            s = s.replace("()", "");
        }
        if (s.length() > 0) {
            return false;
        }
        return true;
    }

    public boolean isValid2(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c=='('){
                stack.push(')');
            } else if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else if(stack.isEmpty()||c!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
