package com.bruce.open.micode;

/**
 * Created by qizhenghao on 17/10/30.
 */

public class Q9 {

    public static void main(String[] args) {

        System.out.println(solution("124682385 2"));
        System.out.println(solution("124682385 3"));
        System.out.println(solution("124682385 4"));
        System.out.println(solution("2222222 4"));
        System.out.println(solution("10200 1"));
        System.out.println(solution("10200 2"));
        System.out.println(solution("1432219 3"));
        System.out.println(solution("1266 3"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        StringBuilder result = new StringBuilder();
        String[] arrStr = line.split(" ");

        char[] chars = arrStr[0].toCharArray();
        int K = Integer.parseInt(arrStr[1]);

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                int n = 1;
                if (chars[j] == ' ')
                    continue;
                while (chars[j+n] == ' ' && (j + n) < chars.length - 1) {
                    n++;
                }
                if (chars[j] > chars[j+n]) {
                    chars[j] = ' ';
                    break;
                } else if (chars[j] == chars[j + n]) {
                    while (chars[j] == chars[j + n] && (j + n) < chars.length - 1) {
                        n++;
                    }
                    if (j + n == chars.length - 1) {
                        chars[j] = ' ';
                        break;
                    }
                }
            }
        }

        int n = 0;
        for (char aChar : chars) {
            if (aChar != ' ') {
                result.append(aChar);
            } else {
                n++;
            }
        }

        String res = result.toString();
        // 返回处理后的结果
        return String.valueOf(Integer.valueOf(res.substring(0, res.length() - K + n)));
    }
}
