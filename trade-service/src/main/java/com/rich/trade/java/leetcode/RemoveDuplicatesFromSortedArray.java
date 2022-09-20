package com.rich.trade.java.leetcode;

/**
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 *
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 *
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 *
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
       int[] nums={0,0,1,1,3,4,4};
       Solution_RemoveDuplicatesFromSortedArray s= new Solution_RemoveDuplicatesFromSortedArray();
       int result=s.removeDuplicates(nums);
       System.out.println(result);
    }
}

class Solution_RemoveDuplicatesFromSortedArray{
    public int removeDuplicates(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[++index]=nums[i+1];
            }
        }
        return index+1;
    }
}
