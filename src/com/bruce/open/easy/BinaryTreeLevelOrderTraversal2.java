package com.bruce.open.easy;

import com.bruce.open.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * return its bottom-up level order traversal as:
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 */
public class BinaryTreeLevelOrderTraversal2 {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);
        List list = levelOrderBottom(node);
        
    }
    
    private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList();


        return null;
    }
}
