package com.bruce.open.offer;

import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2017/2/26 0026.
 *
 * 找出字符串中第一个只出现一次的字符
 */
public class Question_35 {

    public static void main(String[] args) {

        String str = "abcabcd";

        System.out.println(firstNoRepeatChar(str));
    }

    public static Character firstNoRepeatChar(String str) {
        if (str == null)
            return null;

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] arrChars = str.toCharArray();
        for (int i = 0; i < arrChars.length; i++) {
            if (map.containsKey(arrChars[i]))
                map.put(arrChars[i], map.get(arrChars[i]) + 1);
            else
                map.put(arrChars[i], 1);
        }

        for (char key:
             map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return null;
    }
}
