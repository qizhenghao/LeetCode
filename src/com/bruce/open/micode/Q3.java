package com.bruce.open.micode;

/**
 * Created by qizhenghao on 17/10/30.
 *
 * 大数相减
 */

public class Q3 {

    public static void main(String[] args) {

        System.out.println(solution("1112121116 - 256933"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(" - ");
        StringBuilder result = new StringBuilder();
        boolean isDown = false;
        char a0, a1;
        int i = arrStr[0].length() - 1;
        int minIndex = i - arrStr[1].length();
        for (; i > minIndex; i--) {
            a0 = arrStr[0].charAt(i);
            a1 = arrStr[1].charAt(i - minIndex - 1);
            if (isDown) a0 -= 1;
            if (a0 < a1) {
                isDown = true;
                a0 += 10;
            } else {
                isDown = false;
            }
            result.insert(0, a0 - a1);
        }
        a0 = arrStr[0].charAt(i);
        if (isDown) a0 -= 1;
        result.insert(0, a0);
        // 返回处理后的结果
        return arrStr[0].substring(0, i) + result.toString();
    }
}
