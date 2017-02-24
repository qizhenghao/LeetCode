package com.bruce.open.offer;

/**
 * Created by qizhenghao on 17/2/24.
 *
 * 写一个函数,求两个整数之和,要求在函数体内不得使用+、-、*、/四则 运算符号
 */
public class Question_47 {

    public static void main(String[] args) {

        System.out.println(add(10, 22));
        System.out.println(add(8, 22));
        System.out.println(add(3, 12));
    }

    public static int add(int num1, int num2) {

        int tempNum1;
        while (num2!=0) {
            tempNum1 = num1 ^ num2;
            num2 = (num1&num2) << 1;
            num1 = tempNum1;
        }
        return num1;
    }
}
