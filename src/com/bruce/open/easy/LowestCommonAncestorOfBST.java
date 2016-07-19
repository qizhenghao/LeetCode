package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 * <p>
 * <p>
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is
 * defined between two nodes v and w as the lowest node in T that has both v and w as
 * descendants (where we allow a node to be a descendant of itself).”
 * <p>
 * _______6______
 * /              \
 * ___2__          ___8__
 * /      \        /      \
 * 0      _4       7       9
 *       /  \
 *       3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is
 * LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 *
 * 二叉搜索树(BST)的特点是，小的值在左边，大的值在右边
 */
public class LowestCommonAncestorOfBST {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(2);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(0);
        node.left.right = new TreeNode(4);

        System.out.println(lowestCommonAncestor(node, node.left, node.right).val + "");
    }


    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
