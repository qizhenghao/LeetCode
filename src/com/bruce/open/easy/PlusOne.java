package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/20.
 * <p>
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})) + "");
        System.out.println(Arrays.toString(plusOne(new int[]{0})) + "");
    }

    private static int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0)
            return digits;
        int one = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (one == 1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] = one + digits[i];
                    one = 0;
                }
            }
        }
        if (one == 0)
            return digits;
        else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }
}
