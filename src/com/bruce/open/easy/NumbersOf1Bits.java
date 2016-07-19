package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 * <p>
 * Write a function that takes an unsigned integer and returns the number of ’1' bits
 * it has (also known as the Hamming weight).
 * <p>
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011,
 * so the function should return 3.
 */
public class NumbersOf1Bits {

    public static void main(String[] args) {

//        System.out.println(hammingWeight(11) + "");
        System.out.println(hammingWeight1(1) + "");
        System.out.println(hammingWeight1(2) + "");
        System.out.println(hammingWeight1(3) + "");
        System.out.println(hammingWeight1(11) + "");
        System.out.println(hammingWeight1(-1) + "");
        System.out.println(hammingWeight1(-2) + "");
        System.out.println(hammingWeight1(-3) + "");
        System.out.println(hammingWeight1(-11) + "");
    }


    //笨方法
    private static int hammingWeight(int n) {

        int result = 0;
        String binStr = Integer.toBinaryString(n);
        int minLength = n >= 0 ? Math.min(binStr.length(), n / 16 + 4) : binStr.length();
        for (int i = 0; i < minLength; i++) {
            if (binStr.charAt(binStr.length() - i - 1) == '1') {
                result++;
            }
        }
        return result;
    }

    //利用位运算,没想到。。。
    private static int hammingWeight1(int n) {

        int result = 0;
        while (n != 0) {
            n &= n - 1;
            result++;
        }
        return result;
    }
}
