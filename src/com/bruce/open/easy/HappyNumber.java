package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example: 19 is a happy number
 * <p> //下面的等式左边的2表示平方的意思
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public static void main(String[] args) {

        System.out.println(isHappy(19) + "");
        System.out.println(isHappy(68) + "");
        System.out.println(isHappy(29) + "");
        System.out.println(isHappy(1) + "");
        System.out.println(isHappy(7) + "");
        System.out.println(isHappy(9) + "");
    }

    private static boolean isHappy(int n) {
        if (n < 10) {
            return n == 1 || n == 7;
        }
        int newN = 0;
        while (n > 0) {
            int m = n % 10;
            newN += m * m;
            n /= 10;
        }
        return isHappy(newN);
    }
}
