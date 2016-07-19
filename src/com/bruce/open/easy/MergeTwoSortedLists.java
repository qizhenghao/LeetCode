package com.bruce.open.easy;

import com.bruce.open.model.ListNode;

/**
 * Created by qizhenghao on 16/7/19.
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made
 * by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(8);
        l2.next.next.next = new ListNode(9);

        ListNode tempNode = mergeTwoLists(l1, l2);

        while (tempNode != null) {
            System.out.println(tempNode.val + "");
            tempNode = tempNode.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode head = new ListNode(0);
        ListNode result = l1.val <= l2.val ? l1 : l2;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return result;
    }
}
