package com.rich.trade.java.leetcode;

import java.util.Arrays;

/**
 * 1619. 删除某些元素后的数组均值
 * https://leetcode.cn/problems/mean-of-array-after-removing-some-elements/
 */
public class MeanOfArrayAfterRemovingSomeElements {
    public static void main(String[] args) {
        int[] x={1,3,6,8,11,13,1,3,6,8,11,13,1,3,6,8,11,13,11,13};
        Solution s=new Solution();
        double result=s.trimMean(x);
        System.out.println(result);
    }
}

class Solution {
    public double trimMean(int[] arr) {
        double ans=0;
        Arrays.sort(arr);
        for(int i=arr.length*1/20;i<arr.length*19/20;i++){
            ans+=arr[i];
        }
        return ans/(arr.length*9/10);
    }
}
