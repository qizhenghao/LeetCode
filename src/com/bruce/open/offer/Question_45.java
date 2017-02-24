package com.bruce.open.offer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qizhenghao on 17/2/24.
 *
 * 0, 1, … , n-1 这 n 个数字排成一个圈圈，从数字 0 开始每次从圆圏里删除第 m 个数字。求出这个圈圈里剩下的最后一个数字。
 */
public class Question_45 {

    public static void main(String[] args) {

        System.out.println(leftNode(16, 4));
        System.out.println(leftNode(3, 4));
        System.out.println(leftNode(10, 4));

        System.out.println(leftNode1(16, 4));
        System.out.println(leftNode1(3, 4));
        System.out.println(leftNode(10, 4));

    }

    public static int leftNode(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        List list = new LinkedList();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int rmIndex = 0;
        while (list.size() > 1) {
            rmIndex = (rmIndex + m-1)%list.size();
            list.remove(rmIndex);
        }
        return (int) list.get(0);
    }

    public static int leftNode1(int n, int m) {
        if (n < 1 || m < 1)
            return -1;
        int last = 0;
        for (int i = 2; i <= n; i++) {
            last = (last + m)%i;
        }
        return last;
    }
}
