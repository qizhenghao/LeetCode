package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/22.
 * <p>
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {

    public static void main(String[] args) {

        System.out.println(trailingZeroes(225) + "");
    }


    private static int trailingZeroes(int n) {
        int result = 0;
        while (n>0) {
            n /= 5;
            result += n;
        }
        return result;
    }
}
