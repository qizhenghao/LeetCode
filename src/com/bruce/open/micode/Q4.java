package com.bruce.open.micode;

import java.util.HashMap;

/**
 * Created by qizhenghao on 17/10/30.
 * <p>
 * 描述
 * <p>
 * 输入一个乱序的连续数列，输出其中最长连续数列长度，要求算法复杂度为  O(n)  。
 * 输入
 * <p>
 * 54,55,300,12,56
 * 输出
 * <p>
 * 3
 */

public class Q4 {

    public static void main(String[] args) {

        System.out.println(solution("54,55,300,12,56"));
        System.out.println(solution("100,4,200,1,3,2"));
        System.out.println(solution("1,2,3,4,5,6"));
        System.out.println(solution("1"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(",");
        HashMap<Integer, Object> map = new HashMap<>(arrStr.length * 4 / 3 + 1);
        int min = Integer.parseInt(arrStr[0]), max = Integer.parseInt(arrStr[0]), temp;
        for (String anArrStr : arrStr) {
            temp = Integer.valueOf(anArrStr);
            if (temp < min)
                min = temp;
            if (temp > max)
                max = temp;
            map.put(temp, temp);
        }

        int tempLength = 1, maxLength = 1;
        for (int i = min + 1; i <= max; i++) {
            if (map.get(i) != null) {
                tempLength++;
                if (tempLength > maxLength)
                    maxLength = tempLength;
            } else
                tempLength = 0;
        }

        // 返回处理后的结果
        return String.valueOf(maxLength);
    }
}
