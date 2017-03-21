package com.bruce.open.self;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by qizhenghao on 17/3/21.
 */
public class CommonParent {

    public static void main(String[] args) {



        CommonParent commonParent = new CommonParent();
        commonParent.test();
    }

    void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入各个树节点的值（按照深度层次输入，以空格分开，回车结束）：");
        String str = scanner.nextLine();
        String[] array = str.split(" ");

        System.out.println(Arrays.toString(array));

        System.out.println("请输入需要查找共同祖先的两个树节点的值(以空格分开)：");

        String findStr = scanner.nextLine();

        String[] findArr = findStr.split(" ");

        System.out.println(Arrays.toString(findArr));


        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right.left = new TreeNode(5);
        node.right.right = new TreeNode(6);
        node.right.right.right = new TreeNode(7);
        node.right.right.right.right = new TreeNode(8);
        System.out.println(findCommonParent(node, node.right.left, node.right.right).val);
    }

    boolean isChild(TreeNode root, TreeNode node) {
        if (root == null)
            return false;
        if (root == node)
            return true;

        return isChild(root.left, node) || isChild(root.right, node);
    }

    TreeNode commonParent(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null) return null;
        if (root == node1 || root == node2) return root;
        boolean isLeft = isChild(root.left, node1);
        boolean isRight = isChild(root.left, node2);

        if (isLeft != isRight)
            return root;

        TreeNode nextRoot = isLeft ? root.left : root.right;

        return commonParent(nextRoot, node1, node2);
    }

    TreeNode findCommonParent(TreeNode root, TreeNode node1, TreeNode node2) {
        if (!isChild(root, node1) || !isChild(root, node2))
        {
            return null;
        }

        return commonParent(root, node1, node2);
    }

    class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int v) {
            this.val = v;
        }
    }
}

