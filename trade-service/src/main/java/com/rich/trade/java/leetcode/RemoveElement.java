package com.rich.trade.java.leetcode;

/**
 * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 说明:
 *
 * 为什么返回数值是整数，但输出的答案是数组呢?
 *
 * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 * 你可以想象内部操作如下:
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
