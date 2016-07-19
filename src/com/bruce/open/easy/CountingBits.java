package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/19.
 * <p>
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num
 * calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * <p>
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)).
 * But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount
 * in c++ or in any other language.
 */
public class CountingBits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(16)) + "");
    }

    private static int[] countBits(int num) {
        int[] result = new int[num + 1];
        if (num == 0)
            return result;
        int power = 1;
        result[1] = 1;
        for (int i = 2; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                result[i] = 1;
                power *= 2;
            } else {
                result[i] = result[power] + result[i - power];
            }
        }
        return result;
    }
}
