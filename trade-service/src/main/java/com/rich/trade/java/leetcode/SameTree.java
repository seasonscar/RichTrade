package com.rich.trade.java.leetcode;

/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class SameTree {
    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = null;
        p.right = new TreeNode(1);

        TreeNode q = new TreeNode(1);
        q.left = null;
        q.right = new TreeNode(1);

        Solution_SameTree s = new Solution_SameTree();
        boolean result = s.isSameTree(p, q);
    }

}

class Solution_SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p.left == null && q.left != null) return false;
        if (p.left != null && q.left == null) return false;
        if (p.right == null && q.right != null) return false;
        if (p.right != null && q.right == null) return false;
        if (p.val != q.val) return false;

        boolean leftsame = isSameTree(p.left, q.left);
        boolean rightsame = isSameTree(p.right, q.right);
        return leftsame && rightsame;
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
