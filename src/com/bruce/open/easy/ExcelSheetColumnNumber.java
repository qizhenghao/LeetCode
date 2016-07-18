package com.bruce.open.easy;

/**
 * Created by qizhenghao on 16/7/18.
 *
 * Related to question Excel Sheet Column Title
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 * For example:
 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("AAA") + "");
    }

    private static int titleToNumber(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            result += (s.charAt(i) - 64)*Math.pow(26, length-i-1);
//            result = result * 26 + (s.charAt(i) - '@');//这样写也行
        }
        return result;
    }
}
