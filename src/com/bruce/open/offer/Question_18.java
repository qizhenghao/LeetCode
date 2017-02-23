package com.bruce.open.offer;

import com.bruce.open.model.TreeNode;

/**
 * Created by qizhenghao on 17/2/23.
 *
 * 输入两颗二叉树 A 和 B,判断 B 是不是 A 的子结构。
 */
public class Question_18 {

    public static void main(String[] args) {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

        System.out.println(hasSubTree(node1, node2));
        System.out.println(hasSubTree(node1, node3));
    }

    private static boolean hasSubTree(TreeNode node1, TreeNode node2) {
        boolean result = false;
        if (node1 != null && node2 != null) {
            if (node1.val == node2.val)
                result = checkNext(node1, node2);
            if (!result)
                result = hasSubTree(node1.left, node2);
            if (!result)
                result = hasSubTree(node1.right, node2);
        }
        return result;
    }

    private static boolean checkNext(TreeNode node1, TreeNode node2) {
        if (node2 == null)
            return true;
        if (node1 == null || node1.val != node2.val)
            return false;
        return checkNext(node1.left, node2.left) && checkNext(node1.right, node2.right);
    }


}
