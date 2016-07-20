package com.bruce.open.easy;

import com.bruce.open.model.TreeNode;

/**
 * Created by Administrator on 2016/7/16 0016.
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(2);
        node.right.left = new TreeNode(2);
        node.left.left.left = new TreeNode(3);
        node.left.left.right = new TreeNode(3);

        System.out.println(maxDepth(node));
    }

    static int maxDepth(TreeNode node) {
        int depth = 0;
        if (node == null)
            return depth;
        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);
        depth = leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
        return depth;
    }
}
