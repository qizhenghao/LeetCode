package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(3);
        deleteDuplicates(node);
        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.println(tempNode.val + "");
            tempNode = tempNode.next;
        }

    }

    private static ListNode deleteDuplicates(ListNode head) {

        ListNode delNode = head;
        ListNode tempHead = head;
        while (tempHead != null) {
            if (tempHead.val != delNode.val) {
                delNode = tempHead;
            } else {
                delNode.next = tempHead.next;
            }
            tempHead = delNode.next;
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
