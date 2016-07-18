package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 */
public class SameTree {

    public static void main(String[] args) {

        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);

        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.right = new TreeNode(3);
        node1.left.left = new TreeNode(4);
//        node1.left.right = new TreeNode(5);

        System.out.println(isSameTree(node, node1) + "");
    }


    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if ((p==null&&q!=null) || (p!=null&&q==null) || (p!=null && q!= null && p.val != q.val))
            return false;
        else
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        //还可以简化一下条件
//        if (p == null || q == null)
//            return p == q; // if one of them is null, it will return false. both null, true.
//        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // equal val, equal subtrees

    }

    private static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
