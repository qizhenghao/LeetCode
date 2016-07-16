package com.bruce.open.easy;

/**
 * Created by Administrator on 2016/7/16 0016.
 */
public class InvertBinaryTree {


    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
//        node.right.left = new TreeNode(5);
//        node.left.left.left = new TreeNode(6);

        output(node);

        System.out.println();

        output(invertTree(node));
    }

    static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    static void output(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.val);
        output(root.left);
        output(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
