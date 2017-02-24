package com.bruce.open.offer;

import com.bruce.open.model.TreeNode;

/**
 * 题目一:输入一棵二叉树的根结点,求该树的深度。
 * 从根结点到叶结点依次经过的结点(含根、叶结点)形成树的一条路径,最长路径的长度为树的深度。
 */
public class Question_39 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;
        node4.left = node6;
        Question_39 p = new Question_39();
        System.out.println(p.treeDepth(root));
    }

    public int treeDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return (left > right) ? left + 1 : right + 1;
    }
}