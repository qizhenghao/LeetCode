package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 */
public class ReverseLinkedList {


    public static void main(String[] args) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        ListNode tempNode = reverseList(node);
        ListNode tempNode = reverseList1(node);
        while (tempNode != null) {
            System.out.println(tempNode.val + "");
            tempNode = tempNode.next;
        }
    }

    //第一种,递归
    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return  newHead;
    }

    //第二种,循环
    private static ListNode reverseList1(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
