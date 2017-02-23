package com.bruce.open.offer;

import com.bruce.open.model.ListNode;

import java.util.Stack;

/**
 * Created by qizhenghao on 17/2/17.
 *
 * 题目:输入一个链表的头结点,从尾到头反过来打印出每个结点的值。
 */
public class Question_5 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        printListReverse1(node1);
        printListReverse2(node1);
    }

    //使用栈方式
    public static void printListReverse1(ListNode node) {
        Stack<ListNode> stack = new Stack<>();
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop().val + " ");
    }

    //递归方式
    public static void printListReverse2(ListNode node) {
        if (node !=null) {
            printListReverse2(node.next);
            System.out.println(node.val + " ");
        }
    }
}
