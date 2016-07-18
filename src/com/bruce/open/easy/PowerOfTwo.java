package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(64) + "");
        System.out.println(isPowerOfTwo(1) + "");
        System.out.println(isPowerOfTwo(2) + "");
        System.out.println(isPowerOfTwo(0) + "");
    }


    private static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
