package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 * <p>
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(81) + "");
    }


    private static boolean isPowerOfThree(int n) {
        if (n <= 0)
            return false;
        while (n > 1 && n % 3 == 0)
            n /= 3;
        return n==1;
    }
}
