package com.bruce.open.micode;

/**
 * Created by qizhenghao on 17/10/30.
 */

public class Q2 {

    public static void main(String[] args) {

        System.out.println(solution("10 10 11 12 12 11 16"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(" ");
        int resultNum = Integer.parseInt(arrStr[0]);
        for (int i = 1; i < arrStr.length; i++) {
            resultNum ^= Integer.parseInt(arrStr[i]);
        }
        // 返回处理后的结果
        return String.valueOf(resultNum);
    }
}
