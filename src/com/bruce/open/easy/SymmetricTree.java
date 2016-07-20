package com.bruce.open.easy;

import com.bruce.open.model.TreeNode;

import java.util.Stack;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */
public class SymmetricTree {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(1);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        System.out.println(isSymmetric(node) + "");
    }

    private static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();
            if (node1 == node2)
                continue;
            if (node1 == null || node2 == null || node1.val != node2.val)
                return false;
            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node1.right);
            stack.push(node2.left);
        }
        return true;
    }
}
