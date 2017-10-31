package com.bruce.open.self;

import com.bruce.open.model.TreeNode;

import java.util.Stack;

/**
 * Created by qizhenghao on 17/5/11.
 */
public class TreeTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        preTraversal(root);
        System.out.println();
        inTraversal(root);
        System.out.println();
        postTraversal(root);

    }


    //先序遍历
    private static void preTraversal(TreeNode root) {
//        if (root == null)
//            return;
//        print(root);
//        if (root.left != null)
//            preTraversal(root.left);
//        if (root.right != null)
//            preTraversal(root.right);

        //非递归
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            print(node);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
    }

    //中序遍历
    private static void inTraversal(TreeNode root) {
//        if (root == null)
//            return;
//        if (root.left != null)
//            inTraversal(root.left);
//        print(root);
//        if (root.right != null)
//            inTraversal(root.right);

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                TreeNode node = stack.pop();
                print(node);
                p = node.right;
            }
        }
    }

    //后序遍历
    private static void postTraversal(TreeNode root) {
//        if (root == null)
//            return;
//        if (root.right != null)
//            postTraversal(root.right);
//        if (root.left != null)
//            postTraversal(root.left);
//        print(root);

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode pre = p;
        while (p != null || !stack.isEmpty()) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                if (stack.isEmpty())
                    return;
                p = stack.peek();
                if (p.right != null && p.right != pre) {
                    p = p.right;
                } else {
                    p = stack.pop();
                    print(p);
                    pre = p;
                    p = null;
                }
            }
        }
    }


    private static void print(TreeNode root) {
        System.out.print(root.val + " ");
    }

}
