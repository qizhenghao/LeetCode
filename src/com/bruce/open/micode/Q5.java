package com.bruce.open.micode;

import java.util.HashMap;

/**
 * Created by qizhenghao on 17/10/30.
 * 描述
 * <p>
 * 给出一个有序数列随机旋转之后的数列，如原有序数列为：[0,1,2,4,5,6,7] ，旋转之后为[4,5,6,7,0,1,2]。
 * 假定数列中无重复元素，且数列长度为奇数。
 * 求出旋转数列的中间值。如数列[4,5,6,7,0,1,2]的中间值为4。
 * 输入
 * <p>
 * 4,5,6,7,0,1,2
 * 输出
 * <p>
 * 4
 */

public class Q5 {

    public static void main(String[] args) {

        System.out.println(solution("4,5,6,7,0,1,2"));
        System.out.println(solution("100,4,200,1,3,2,0"));
        System.out.println(solution("1,2,3,4,5,6,7"));
        System.out.println(solution("1"));
        System.out.println(solution("12,13,14,5,6,7,8,9,10"));
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] arrStr = line.split(",");
        String result = arrStr[0];
        int middleIndex = arrStr.length / 2;
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

        int tempIndex = -1;
        for (int i = min; i <= max; i++) {
            if (map.get(i) != null) {
                tempIndex++;
                if (tempIndex == middleIndex) {
                    result = String.valueOf(map.get(i));
                    break;
                }
            }
        }

        // 返回处理后的结果
        return result;
    }
}
