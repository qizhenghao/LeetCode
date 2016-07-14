package com.bruce.open.easy;

import java.util.Arrays;

/**
 * Created by qizhenghao on 16/7/14.
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("nima") + "");
    }

    static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
