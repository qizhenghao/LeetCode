package com.bruce.open.easy;

import com.bruce.open.model.ListNode;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * <p>
 * Your algorithm should use only constant space. You may not modify
 * the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next = new ListNode(6);
        ListNode tempNode = swapPairs(node);
        while (tempNode != null) {
            System.out.println(tempNode.val + "");
            tempNode = tempNode.next;
        }
    }

    private static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode cur = result;
        while (cur != null && cur.next != null && cur.next.next != null) {
            ListNode temp1 = cur.next;
            ListNode temp2 = cur.next.next;
            temp1.next = temp2.next;
            temp2.next = temp1;
            cur.next = temp2;
            cur = cur.next.next;
        }
        return result.next;
    }
}
