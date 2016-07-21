package com.bruce.open.easy;

import com.bruce.open.model.TreeNode;

/**
 * Created by qizhenghao on 16/7/21.
 * <p>
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 */
public class BalancedBinaryTree {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.right.right = new TreeNode(7);
        node.right.right.right.right = new TreeNode(8);



        System.out.println(isBalanced(node) + "");
    }



    private static boolean isBalanced(TreeNode root) {
        return maxDepth(root) != -1;
    }


    static int maxDepth(TreeNode node) {
        if (node == null)
            return 0;
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);
        if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1)
            return -1;
        return Math.max(leftDepth, rightDepth) + 1;
    }

    //错误实现
    private static boolean isBalanced1(TreeNode root) {
        if (root == null)
            return true;
        if ((root.left == null && root.right== null) || (root.right == null && root.left.left== root.left.right) || ((root.left == null && root.right.left== root.right.right)))
            return true;
        else if ((root.right == null && root.left.left!= null) || (root.right == null && root.left.right!=null) || (root.left == null && root.right.left!= null) || (root.left == null && root.right.right!=null))
            return false;
//        else if (root.left!=null && root.right!=null && )
//            return false;
        else
            return isBalanced1(root.left) && isBalanced1(root.right);
    }
}
