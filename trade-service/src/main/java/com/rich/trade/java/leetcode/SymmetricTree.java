package com.rich.trade.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你一个二叉树的根节点 root,检查它是否轴对称。
 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, null);
        Solution_SymmetricTree s = new Solution_SymmetricTree();
        s.isSymmetric(root);
    }
}

class Solution_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isequal(left, right);
    }

    boolean isequal(TreeNode left, TreeNode right) {

        //首先比较根节点是否一致，如果根节点不一致，就没必要继续比较了，终止递归返回false
        //如果根节点均为空，说明也没必要继续比较了，终止递归返回true
        //注意要先处理根节点为null的情况，只有根节点不为null，才能使用->val
        if (left == null && right == null) return true;
        else if (left == null && right != null || left != null && right == null) return false;
        else if (left.val != right.val) return false;

        //当根节点对称时，递归比较根节点左右子树是否对称，注意这里两个子树的对应关系，应该是外侧等于外侧，内侧等于内侧
        boolean outside = isequal(left.left, right.right);
        boolean inside = isequal(left.right, right.left);

        //当左右子树也对称时候，返回以left和right为根节点的两个子树对称
        boolean res = inside && outside;
        return res;
    }

    public boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        // 空树
        if (root == null)
            return true;
        // 根节点的左右子节点分别入队
        queue.add(root.left);
        queue.add(root.right);
        // 队列不为空
        while (!queue.isEmpty()) {
            // 左右节点分别出队
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            // 如果这两个节点为null，继续执行循环有可能节点为子节点，也有可能这个两个节点没有左节点和右节点，队列还有其他元素。
            if (left == null && right == null)
                continue;
            // 如果这两个节点有一个为空，就说明不对称
            if (left == null||right == null)
                return false;
            // 如果这两个节点的值不同，就说明不对称
            if (left.val != right.val)
                return false;
            // 左节点的左子节点入队 ---1
            queue.add(left.left);
            // 右节点的右子节点入队 ---2    1,2两节点比较
            queue.add(right.right);
            // 左节点的右子节点入队 ---3
            queue.add(left.right);
            // 右节点的左子节点入队 ---4     3,4两节点比较
            queue.add(right.left);
        }
        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
