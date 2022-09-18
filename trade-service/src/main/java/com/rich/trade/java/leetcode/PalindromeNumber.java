package com.rich.trade.java.leetcode;

/**
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 2694962;
        int y = 2694961;
        Solution_PalindromeNumber s = new Solution_PalindromeNumber();
        System.out.println(s.isPalindrome(x));
        System.out.println(s.isPalindrome(y));
    }
}

class Solution_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem = 0, y = 0;
        int quo = x;
        while (quo != 0) {
            rem = quo % 10;
            y = y * 10 + rem;
            quo = quo / 10;
        }
        return y == x;
    }
}
