package com.bruce.open.easy;

import java.util.Stack;

/**
 * Created by qizhenghao on 16/7/21.
 * <p>
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 */
public class ImplementQueueUsingStacks {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        queue.pop();
        System.out.println(queue.empty() + "");
        queue.push(6);
        System.out.println(queue.peek() + "");
        queue.push(7);
        while (!queue.empty()) {
            System.out.println(queue.peek() + "");
            queue.pop();
        }
    }


    static class MyQueue {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();

        // Push element x to the back of queue.
        public void push(int x) {
            stack.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            while (!stack.isEmpty()) {
                tempStack.push(stack.peek());
                stack.pop();
            }
            tempStack.pop();
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.peek());
                tempStack.pop();
            }
        }

        // Get the front element.
        public int peek() {
            while (!stack.isEmpty()) {
                tempStack.push(stack.peek());
                stack.pop();
            }
            int peek = tempStack.peek();
            while (!tempStack.isEmpty()) {
                stack.push(tempStack.peek());
                tempStack.pop();
            }
            return peek;
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack.isEmpty();
        }
    }
}
