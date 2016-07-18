package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 *
 * Write a function to delete a node (except the tail) in a singly linked list,
 * given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList {

    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        deleteNode(node.next.next);
        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.println(tempNode.val + "");
            tempNode = tempNode.next;
        }
    }

    private static void deleteNode(ListNode node) {
        if (node == null || node.next == null)
            return;
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
