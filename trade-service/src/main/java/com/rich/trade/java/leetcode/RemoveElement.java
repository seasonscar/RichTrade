package com.rich.trade.java.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3,5};
        Solution_RemoveElement s = new Solution_RemoveElement();
        s.removeElement2(nums, 3);

    }
}

class Solution_RemoveElement {
    public int removeElement2(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                j++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] != nums[k] && k > i) {
                        nums[i] = nums[k];
                        nums[k] = val;
                        break;
                    }
                }
            }
        }
        return nums.length - j;
    }
}
