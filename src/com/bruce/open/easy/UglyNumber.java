package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/19.
 */
public class UglyNumber {

    public static void main(String[] args) {

        System.out.println(isUgly(16) + "");
        System.out.println(isUgly(50) + "");
        System.out.println(isUgly(180) + "");
        System.out.println(isUgly(1) + "");
        System.out.println(isUgly(0) + "");
        System.out.println(isUgly(-0) + "");
        System.out.println(isUgly(-1) + "");
        System.out.println(isUgly(-16) + "");
    }

    private static boolean isUgly(int num) {
        if (num < 1)
            return false;
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }
}
