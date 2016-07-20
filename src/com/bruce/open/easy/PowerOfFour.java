package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 */
public class PowerOfFour {

    public static void main(String[] args) {

        System.out.println(isPowerOfFour(16) + "");
        System.out.println(isPowerOfFour(26) + "");
        System.out.println(isPowerOfFour(8) + "");
        System.out.println(isPowerOfFour(-16) + "");
    }

    private static boolean isPowerOfFour(int num) {
        return num > 0 && (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }

}
