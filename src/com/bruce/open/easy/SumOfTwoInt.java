package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/15.
 */
public class SumOfTwoInt {

    public static void main(String[] args) {
        System.out.println(getSum(17, 20) + "");
    }

    private static int getSum(int a, int b) {
        if (b == 0)
            return a;
        while (b != 0) {
            int c = a & b;
            a ^= b;
            b = c << 1;
        }
        return a;
    }
}
