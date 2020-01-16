package com.bruce.open.micode;

/**
 * Created by qizhenghao.
 */

public class Q10 {

    public static void main(String[] args) {

        System.out.println(solution("0"));
        System.out.println(solution("2"));
        System.out.println(solution("5"));
        System.out.println(solution("10"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String result = "";
        int input = Integer.valueOf(line);
        if (input == 0)
            return "0";
        result = String.valueOf(calculate(input));
        // 返回处理后的结果
        return result;
    }

    private static int calculate(int input) {
        if (input == 1)
            return 1;
        else if (input == 2)
            return 2;
        else
            return calculate(input - 1) + calculate(input - 2);
    }
}
