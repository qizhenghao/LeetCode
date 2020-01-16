package com.bruce.open.micode;

import java.util.HashMap;

/**
 * Created by qizhenghao.
 */

public class Q11 {

    public static void main(String[] args) {

        System.out.println(solution("a b"));
        System.out.println(solution("aa ab"));
        System.out.println(solution("aa aab"));
        System.out.println(solution("uak areuok"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String result = "true";
        String[] arrStr = line.split(" ");

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arrStr[0].length(); i++) {
            int value = 0;
            if (map1.get(arrStr[0].charAt(i)) != null)
                value = map1.get(arrStr[0].charAt(i));
            map1.put(arrStr[0].charAt(i),  value + 1);
        }
        for (int i = 0; i < arrStr[1].length(); i++) {
            int value = 0;
            if (map2.get(arrStr[1].charAt(i)) != null)
                value = map2.get(arrStr[1].charAt(i));
            map2.put(arrStr[1].charAt(i),  value + 1);
        }
        for (int i = 0; i < arrStr[0].length(); i++) {
            char key = arrStr[0].charAt(i);
            int value1 = map1.get(key);
            int value2 = map2.get(key) == null ? 0 : map2.get(key);
            if (value2 < value1)
                return "false";
        }
        // 返回处理后的结果
        return result;
    }
}
