package com.rich.trade.java.leetcode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(3,new TreeNode(1),new TreeNode(2));
        root.right=new TreeNode(6,new TreeNode(7),new TreeNode(8));
        Solution_InvertBinaryTree s=new Solution_InvertBinaryTree();
        s.invertTree(root);
    }
}

class Solution_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
