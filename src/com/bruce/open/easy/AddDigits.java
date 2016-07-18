package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/15.
 */
public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(87389) + "");
    }

    private static int addDigits(int num) {
        if (num == 0)
            return 0;
        int result = num % 9;
        return result == 0 ? 9 : result;
    }
}
