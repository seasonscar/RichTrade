package com.rich.trade.java.leetcode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode n1=new ListNode(8);
        ListNode n2=new ListNode(0,n1);
        ListNode n3=new ListNode(7,n2);

        ListNode n4=new ListNode(3);
        ListNode n5=new ListNode(1,n4);
        ListNode n6=new ListNode(2,n5);

        Solution_AddTwoNumbers s=new Solution_AddTwoNumbers();
        s.addTwoNumbers(n3,n6);
    }
}
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution_AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode root = new ListNode(0);
            ListNode cursor = root;
            int carry = 0;
            while(l1 != null || l2 != null || carry != 0) {
                int l1Val = l1 != null ? l1.val : 0;
                int l2Val = l2 != null ? l2.val : 0;
                int sumVal = l1Val + l2Val + carry;
                carry = sumVal / 10;

                ListNode sumNode = new ListNode(sumVal % 10);
                cursor.next = sumNode;
                cursor = sumNode;

                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
            }
            return root.next;
        }
    }
